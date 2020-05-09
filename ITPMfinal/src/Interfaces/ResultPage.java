/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Analytics.ControlComplexity;
import Analytics.Controller;
import Analytics.FileAnalyzer;
import Analytics.MethodComplexity;
import Analytics.SizeComplexityMeasuring;
import Analytics.VariableComplexity;
import static Interfaces.Main.filepath;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nuwan
 */
public class ResultPage extends javax.swing.JFrame {

    /**
     * Creates new form ResultPage
     */
    SizeComplexityMeasuring scm = new SizeComplexityMeasuring();
    MethodComplexity mcm = new MethodComplexity();
    VariableComplexity vcm = new VariableComplexity();
    ControlComplexity Ccm = new ControlComplexity();
    
    ArrayList<String> SizeComplexityList = new ArrayList<>();
    ArrayList<String> MethodComplexityList = new ArrayList<>();
    ArrayList<String> VariableComplexityList = new ArrayList<>();
    ArrayList<String> ControlComplexityLst = new ArrayList<>();
    
    int Cs,Wkw,Nkw,Wid,Nid,Wop,Nop,Wnv,Nnv,Wsl,Nsl;
    int Cm,Wmrt,Wpdtp,Npdtp,Wcdtp,Ncdtp;
    int Cv,Wvs,Wpdtv,Npdtv,Wcdtv,Ncdtv;
    int Ccs,Wtcs,NC,Ccspps;
    
    public ResultPage() {
        initComponents();
        setSize(1050,900);
    }
    
    public void getDetails(int value)
    {
        ComplexityLabel.setText(Integer.toString(value));
    }
    
    public void getCodeText(String filepath) throws IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        sizeTextView.read(br, null);
        sizeTextView.requestFocus();
    }
    
    public void getSizeComplexity(String filepath) throws Exception
    {
        //SizeLabel.setText(Integer.toString(scm.SizeComplexityInitializer(br)));
        SizeComplexityList = scm.SizeComplexityInitializer(filepath);
        
        Wkw = Integer.parseInt(SizeComplexityList.get(0));
        Nkw = Integer.parseInt(SizeComplexityList.get(1));
        Wid = Integer.parseInt(SizeComplexityList.get(2));
        Nid = Integer.parseInt(SizeComplexityList.get(3));
        Wop = Integer.parseInt(SizeComplexityList.get(4));
        Nop = Integer.parseInt(SizeComplexityList.get(5));
        Wnv = Integer.parseInt(SizeComplexityList.get(6));
        Nnv = Integer.parseInt(SizeComplexityList.get(7));
        Wsl = Integer.parseInt(SizeComplexityList.get(8));
        Nsl = Integer.parseInt(SizeComplexityList.get(9));
        
        WkwLabel.setText(Integer.toString(Wkw));
        NkwLabel.setText(Integer.toString(Nkw));
        WidLabel.setText(Integer.toString(Wid));
        NidLabel.setText(Integer.toString(Nid));
        WopLabel.setText(Integer.toString(Wop));
        NopLabel.setText(Integer.toString(Nop));
        WnvLabel.setText(Integer.toString(Wnv));
        NnvLabel.setText(Integer.toString(Nnv));
        WslLabel.setText(Integer.toString(Wsl));
        NslLabel.setText(Integer.toString(Nsl));
        
        Cs=(Wkw*Nkw)+(Wid*Nid)+(Wop*Nop)+(Wnv*Nnv)+(Wsl*Nsl);
        CsLabelValue.setText(Integer.toString(Cs));
        SizeLabel.setText(Integer.toString(Cs));
    }
    
    public void getVariableAnalyze(int value)
    {
        KeyWordAnalyzerLabel.setText(Integer.toString(value));
    }
    
    public void getInheritanceAnalyzer(int value)
    {
        InheritanceLabel.setText(Integer.toString(value));
    }
    
    public void getMethodComplexity(String filepath) throws FileNotFoundException, IOException
    {
        MethodComplexityList = mcm.MethodComplexityInitializer(filepath);
        
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CsMethodsTextView.read(br, null);
        CsMethodsTextView.requestFocus();
        
        Wmrt = Integer.parseInt(MethodComplexityList.get(0));
        Wpdtp = Integer.parseInt(MethodComplexityList.get(1));
        Npdtp = Integer.parseInt(MethodComplexityList.get(2));
        Wcdtp = Integer.parseInt(MethodComplexityList.get(3));
        Ncdtp = Integer.parseInt(MethodComplexityList.get(4));
        
        WmrtLabel.setText(Integer.toString(Wmrt));
        WpdtpLabel.setText(Integer.toString(Wpdtp));
        NpdtpLabel.setText(Integer.toString(Npdtp));
        WcdtpLabel.setText(Integer.toString(Wcdtp));
        NcdtpLabel.setText(Integer.toString(Ncdtp));
        
        Cm = Wmrt + (Wpdtp * Npdtp) + (Wcdtp * Ncdtp);
        CmLabel.setText(Integer.toString(Cm));
        
    }
    
    public void getVariableComplexity(String [] str, String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CsVariableView.read(br, null);
        CsVariableView.requestFocus();
        
        VariableComplexityList = vcm.VariableComplexityInitializer(str);
        
        Wvs = Integer.parseInt(VariableComplexityList.get(0));
        Wpdtv = Integer.parseInt(VariableComplexityList.get(1));
        Npdtv = Integer.parseInt(VariableComplexityList.get(2));
        Wcdtv = Integer.parseInt(VariableComplexityList.get(3));
        Ncdtv = Integer.parseInt(VariableComplexityList.get(4));
        
        WvsLabel.setText(Integer.toString(Wvs));
        WpdtvLabel.setText(Integer.toString(Wpdtv));
        NpdtvLabel.setText(Integer.toString(Npdtv));
        WcdtvLabel.setText(Integer.toString(Wcdtv));
        NcdtvLabel.setText(Integer.toString(Ncdtv));
        
        Cv = Wvs * ((Wpdtv * Npdtv) + (Wcdtv * Ncdtv));
        CvLabel.setText(Integer.toString(Cv));
    }
    
    public void getControlStructureConplexity(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CcSVariableView.read(br, null);
        CcSVariableView.requestFocus();
        
        ControlComplexityLst = Ccm.ControlComplexityInitializer(filepath);
        
        Wtcs = Integer.parseInt(ControlComplexityLst.get(0));
        NC = Integer.parseInt(ControlComplexityLst.get(1));
        Ccspps = Integer.parseInt(ControlComplexityLst.get(2));
        
        WtcsLabel.setText(Integer.toString(Wtcs));
        NCLabel.setText(Integer.toString(NC));
        CcsppsLabel.setText(Integer.toString(Ccspps));
        
        Ccs = (Wtcs * NC) + Ccspps;
        CcsLabel.setText(Integer.toString(Ccs));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComplexityLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KeyWordAnalyzerLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InheritanceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SizeLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sizeTextView = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        WkwLabel = new javax.swing.JLabel();
        NkwLabel = new javax.swing.JLabel();
        WidLabel = new javax.swing.JLabel();
        NidLabel = new javax.swing.JLabel();
        WopLabel = new javax.swing.JLabel();
        NopLabel = new javax.swing.JLabel();
        WnvLabel = new javax.swing.JLabel();
        NnvLabel = new javax.swing.JLabel();
        WslLabel = new javax.swing.JLabel();
        NslLabel = new javax.swing.JLabel();
        CsLabelValue = new javax.swing.JLabel();
        CsLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CsMethodsTextView = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        NcdtpLabel = new javax.swing.JLabel();
        WcdtpLabel = new javax.swing.JLabel();
        NpdtpLabel = new javax.swing.JLabel();
        WpdtpLabel = new javax.swing.JLabel();
        WmrtLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CmLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        CsVariableView = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        WvsLabel = new javax.swing.JLabel();
        WpdtvLabel = new javax.swing.JLabel();
        NpdtvLabel = new javax.swing.JLabel();
        WcdtvLabel = new javax.swing.JLabel();
        NcdtvLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CvLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CcSVariableView = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        WtcsLabel = new javax.swing.JLabel();
        NCLabel = new javax.swing.JLabel();
        CcsppsLabel = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        CcsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Analyzer Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Number of Inheritance :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        ComplexityLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ComplexityLabel.setText("--");
        getContentPane().add(ComplexityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Size Complexity :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        KeyWordAnalyzerLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        KeyWordAnalyzerLabel.setText("--");
        getContentPane().add(KeyWordAnalyzerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Code Complexity :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        InheritanceLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        InheritanceLabel.setText("--");
        getContentPane().add(InheritanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Key-Word Usage :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        SizeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SizeLabel.setText("--");
        getContentPane().add(SizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, -1, -1));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sizeTextView.setColumns(20);
        sizeTextView.setRows(5);
        jScrollPane2.setViewportView(sizeTextView);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel6.setText("Nsl");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel7.setText("Wsl");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel8.setText("Nnv");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jLabel9.setText("Wnv");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel10.setText("Nop");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel11.setText("Wop");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel12.setText("Nid");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel13.setText("Wid");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel14.setText("Nkw");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel15.setText("Wkw");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel16.setText("Cs = (Wkw * Nkw) + (Wid * Nid) + (Wop * Nop) + (Wnv * Nnv) + (Wsl * Nsl) ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        WkwLabel.setText("--");
        jPanel1.add(WkwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        NkwLabel.setText("--");
        jPanel1.add(NkwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        WidLabel.setText("--");
        jPanel1.add(WidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        NidLabel.setText("--");
        jPanel1.add(NidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        WopLabel.setText("--");
        jPanel1.add(WopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        NopLabel.setText("--");
        jPanel1.add(NopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        WnvLabel.setText("--");
        jPanel1.add(WnvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        NnvLabel.setText("--");
        jPanel1.add(NnvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        WslLabel.setText("--");
        jPanel1.add(WslLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        NslLabel.setText("--");
        jPanel1.add(NslLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        CsLabelValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CsLabelValue.setText("--");
        jPanel1.add(CsLabelValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        CsLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CsLabel1.setText("Cs");
        jPanel1.add(CsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jTabbedPane1.addTab("Size", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CsMethodsTextView.setColumns(20);
        CsMethodsTextView.setRows(5);
        jScrollPane3.setViewportView(CsMethodsTextView);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel17.setText("Ncdtp");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel18.setText("Wcdtp");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel19.setText("Npdtp");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel20.setText("Wpdtp");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel21.setText("Wmrt");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel22.setText("Cm = Wmrt + (Wpdtp * Npdtp) + (Wcdtp * Ncdtp) ");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        NcdtpLabel.setText("--");
        jPanel2.add(NcdtpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        WcdtpLabel.setText("--");
        jPanel2.add(WcdtpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        NpdtpLabel.setText("--");
        jPanel2.add(NpdtpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        WpdtpLabel.setText("--");
        jPanel2.add(WpdtpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        WmrtLabel.setText("--");
        jPanel2.add(WmrtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Cm");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        CmLabel.setText("--");
        jPanel2.add(CmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jTabbedPane1.addTab("Methods", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CsVariableView.setColumns(20);
        CsVariableView.setRows(5);
        jScrollPane4.setViewportView(CsVariableView);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel24.setText("Ncdtv");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel25.setText("Wcdtv");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel26.setText("Npdtv");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel27.setText("Wpdtv");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jLabel28.setText("Wvs");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel29.setText("Cv = Wvs [(Wpdtv * Npdtv) + (Wcdtv * Ncdtv)] ");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        WvsLabel.setText("--");
        jPanel3.add(WvsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        WpdtvLabel.setText("--");
        jPanel3.add(WpdtvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        NpdtvLabel.setText("--");
        jPanel3.add(NpdtvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        WcdtvLabel.setText("--");
        jPanel3.add(WcdtvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        NcdtvLabel.setText("--");
        jPanel3.add(NcdtvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("Cv");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        CvLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CvLabel.setText("--");
        jPanel3.add(CvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jTabbedPane1.addTab("Variables", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CcSVariableView.setColumns(20);
        CcSVariableView.setRows(5);
        jScrollPane5.setViewportView(CcSVariableView);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel31.setText("Ccspps");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel32.setText("NC");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel33.setText("Wtcs");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel34.setText("Ccs = (Wtcs * NC) + Ccspps ");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        WtcsLabel.setText("--");
        jPanel4.add(WtcsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        NCLabel.setText("--");
        jPanel4.add(NCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        CcsppsLabel.setText("--");
        jPanel4.add(CcsppsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setText("Ccs");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        CcsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CcsLabel.setText("--");
        jPanel4.add(CcsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jTabbedPane1.addTab("Control Stuctures", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 790, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CcSVariableView;
    private javax.swing.JLabel CcsLabel;
    private javax.swing.JLabel CcsppsLabel;
    private javax.swing.JLabel CmLabel;
    private javax.swing.JLabel ComplexityLabel;
    private javax.swing.JLabel CsLabel1;
    private javax.swing.JLabel CsLabelValue;
    private javax.swing.JTextArea CsMethodsTextView;
    private javax.swing.JTextArea CsVariableView;
    private javax.swing.JLabel CvLabel;
    private javax.swing.JLabel InheritanceLabel;
    private javax.swing.JLabel KeyWordAnalyzerLabel;
    private javax.swing.JLabel NCLabel;
    private javax.swing.JLabel NcdtpLabel;
    private javax.swing.JLabel NcdtvLabel;
    private javax.swing.JLabel NidLabel;
    private javax.swing.JLabel NkwLabel;
    private javax.swing.JLabel NnvLabel;
    private javax.swing.JLabel NopLabel;
    private javax.swing.JLabel NpdtpLabel;
    private javax.swing.JLabel NpdtvLabel;
    private javax.swing.JLabel NslLabel;
    private javax.swing.JLabel SizeLabel;
    private javax.swing.JLabel WcdtpLabel;
    private javax.swing.JLabel WcdtvLabel;
    private javax.swing.JLabel WidLabel;
    private javax.swing.JLabel WkwLabel;
    private javax.swing.JLabel WmrtLabel;
    private javax.swing.JLabel WnvLabel;
    private javax.swing.JLabel WopLabel;
    private javax.swing.JLabel WpdtpLabel;
    private javax.swing.JLabel WpdtvLabel;
    private javax.swing.JLabel WslLabel;
    private javax.swing.JLabel WtcsLabel;
    private javax.swing.JLabel WvsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea sizeTextView;
    // End of variables declaration//GEN-END:variables
}
