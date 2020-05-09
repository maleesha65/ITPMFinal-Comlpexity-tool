/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Analytics.Controller;
import Analytics.FileAnalyzer;
import Coupling.Coupling;
import Coupling.CouplingMain;
import Coupling.CustomFile;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.parser.TokenType.EOF;

/**
 *
 * @author nuwan
 */
public class Main extends javax.swing.JFrame {

    public static String filepath;
    ArrayList <CustomFile> fileList = new ArrayList<>();
    public FileAnalyzer analit = new FileAnalyzer();
    Controller ctrl = new Controller();
    ResultPage anzf = new ResultPage();
    CouplingMain cpMain;
    FileReader read;
    BufferedReader br;
    File fl;
    Coupling cp;
            
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setSize(1050,900);
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
        FileBrowseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selectedPathField = new javax.swing.JTextField();
        filNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FileTypeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodeViewer = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        NumOfLines = new javax.swing.JLabel();
        AnalyzeButton = new javax.swing.JButton();
        svmCheckBox = new javax.swing.JCheckBox();
        InheritanceCheckBox = new javax.swing.JCheckBox();
        CouplingCheckBox = new javax.swing.JCheckBox();
        ControlStructureCheckBox = new javax.swing.JCheckBox();
        FileBrowseButton1 = new javax.swing.JButton();
        svmCheckBox1 = new javax.swing.JCheckBox();
        CouplingCheckBox1 = new javax.swing.JCheckBox();
        InheritanceCheckBox1 = new javax.swing.JCheckBox();
        ControlStructureCheckBox1 = new javax.swing.JCheckBox();
        AnalyzeButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Code Complexity Measuring Tool");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        FileBrowseButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FileBrowseButton.setText("UPLOAD");
        FileBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileBrowseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FileBrowseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Upload your code here");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        selectedPathField.setEditable(false);
        selectedPathField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        selectedPathField.setText("Selected Fiile Path");
        getContentPane().add(selectedPathField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 260, -1));

        filNameField.setEditable(false);
        filNameField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        filNameField.setText("File Name");
        getContentPane().add(filNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 260, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Selected File Type :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, -1, -1));

        FileTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FileTypeLabel.setText("--");
        getContentPane().add(FileTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, -1, -1));

        CodeViewer.setColumns(20);
        CodeViewer.setRows(5);
        jScrollPane1.setViewportView(CodeViewer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 250, 360));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Number of Lines :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, -1, -1));

        NumOfLines.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NumOfLines.setText("--");
        getContentPane().add(NumOfLines, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 20, -1));

        AnalyzeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AnalyzeButton.setText("CALCULATE");
        AnalyzeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AnalyzeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnalyzeButtonMouseExited(evt);
            }
        });
        AnalyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AnalyzeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 140, 40));

        svmCheckBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        svmCheckBox.setText("Size , Variables and Method");
        getContentPane().add(svmCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        InheritanceCheckBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        InheritanceCheckBox.setText("Inheritance");
        getContentPane().add(InheritanceCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        CouplingCheckBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CouplingCheckBox.setText("Coupling");
        CouplingCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouplingCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CouplingCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        ControlStructureCheckBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ControlStructureCheckBox.setText("Control Structures");
        getContentPane().add(ControlStructureCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        FileBrowseButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FileBrowseButton1.setText("CLEAR");
        FileBrowseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileBrowseButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(FileBrowseButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, 40));

        svmCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        svmCheckBox1.setText("Size , Variables and Method");
        getContentPane().add(svmCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        CouplingCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CouplingCheckBox1.setText("Coupling");
        CouplingCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouplingCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(CouplingCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        InheritanceCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        InheritanceCheckBox1.setText("Inheritance");
        getContentPane().add(InheritanceCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        ControlStructureCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ControlStructureCheckBox1.setText("Control Structures");
        getContentPane().add(ControlStructureCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        AnalyzeButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AnalyzeButton1.setText("CALCULATE");
        AnalyzeButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AnalyzeButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnalyzeButton1MouseExited(evt);
            }
        });
        AnalyzeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(AnalyzeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileBrowseButtonActionPerformed

        //Selecting the file from file explorer
        JFileChooser choose = new JFileChooser();
        File workingDir = new File(System.getProperty("user.dir"));
        choose.setCurrentDirectory((workingDir));
        choose.showOpenDialog(null);

        //Getting the absolute file path and file name to display
        fl = choose.getSelectedFile();
        filepath = fl.getAbsolutePath();
        String flname = fl.getName();
        selectedPathField.setText((filepath));
        filNameField.setText(flname);
        
        //Deciding whether if it is a Java file or C++ file
        if(filepath.toLowerCase().endsWith(".java"))
        {
            FileTypeLabel.setText("Java");
        }
        else if(filepath.toLowerCase().endsWith(".cpp"))
        {
            FileTypeLabel.setText("C++");
        }
        
        //Viewing the code in the text area
        try
        {
            read = new FileReader(filepath);
            br = new BufferedReader(read);
            CodeViewer.read(br, null);
            //br.close();
            CodeViewer.requestFocus();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        try
        {
            int lineCount;
            lineCount = analit.LineCounter(filepath);
            NumOfLines.setText(Integer.toString(lineCount));
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //Control Structure Complexity
        try
        {
            anzf.getControlStructureConplexity(filepath);
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
       
       
    }//GEN-LAST:event_FileBrowseButtonActionPerformed

    private void AnalyzeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButtonMouseEntered

        AnalyzeButton.setForeground(Color.RED);
    }//GEN-LAST:event_AnalyzeButtonMouseEntered

    private void AnalyzeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButtonMouseExited

        AnalyzeButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_AnalyzeButtonMouseExited

    private void AnalyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeButtonActionPerformed

        //Adding the code to arraylist
        ctrl.setStrArr(CodeViewer.getText().split("\\n"));
        
        String filename = fl.getName();
        CustomFile csFile = new CustomFile(filename);
        csFile.setFileName(filename);
        csFile.setFilePath(filepath);
        fileList.add(csFile);
        
        
        
        try {
            //Passing the code to Analyzeform Text Area
            anzf.getCodeText(filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Calculating the complexity
        anzf.setVisible(true);
        
        //Calculating Code Complexity
        anzf.getDetails(ctrl.CodeAnalyzer(ctrl.getStrArr()));
        
        //Calculating Size Complexity
        try
        {
            anzf.getSizeComplexity(filepath);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //Calculating Number of Variables
        anzf.getVariableAnalyze(ctrl.KeyWordAnalyzer(ctrl.getStrArr()));
        
        
        //Calculating Inheritance
        anzf.getInheritanceAnalyzer(ctrl.InheritanceAnalyzer(ctrl.getStrArr()));
        
        try {
            anzf.getVariableComplexity(ctrl.getStrArr(),filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //Calculating Method Complexity
            anzf.getMethodComplexity(filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_AnalyzeButtonActionPerformed

    private void CouplingCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouplingCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CouplingCheckBoxActionPerformed

    private void FileBrowseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileBrowseButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileBrowseButton1ActionPerformed

    private void CouplingCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouplingCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CouplingCheckBox1ActionPerformed

    private void AnalyzeButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalyzeButton1MouseEntered

    private void AnalyzeButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalyzeButton1MouseExited

    private void AnalyzeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalyzeButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalyzeButton;
    private javax.swing.JButton AnalyzeButton1;
    private javax.swing.JTextArea CodeViewer;
    private javax.swing.JCheckBox ControlStructureCheckBox;
    private javax.swing.JCheckBox ControlStructureCheckBox1;
    private javax.swing.JCheckBox CouplingCheckBox;
    private javax.swing.JCheckBox CouplingCheckBox1;
    private javax.swing.JButton FileBrowseButton;
    private javax.swing.JButton FileBrowseButton1;
    private javax.swing.JLabel FileTypeLabel;
    private javax.swing.JCheckBox InheritanceCheckBox;
    private javax.swing.JCheckBox InheritanceCheckBox1;
    private javax.swing.JLabel NumOfLines;
    private javax.swing.JTextField filNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField selectedPathField;
    private javax.swing.JCheckBox svmCheckBox;
    private javax.swing.JCheckBox svmCheckBox1;
    // End of variables declaration//GEN-END:variables
}