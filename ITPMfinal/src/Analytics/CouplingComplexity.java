/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytics;

import Coupling.CouplingServiceImp;
import FileRead.CustomFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class CouplingComplexity {
    
 /*
Wr = Weight of a recursive call
Nr = Number of recursive calls
Wmcms = Weight of a regular method calling another regular method in the same file
Nmcms = Number of calls from regular method(s) to other regular methods in the same file
Wmcmd = Weight of a regular method calling another regular method in a different file
Nmcmd = Number of calls from regular method(s) to other regular methods in different files
Wmcrms = Weight of a regular method calling a recursive method in the same file
Nmcrms = Number of calls from regular method(s) to recursive methods in the same file
Wmcrmd = Weight of a regular method calling a recursive method in a different filem
Nmcrmd = Number of calls from regular method(s) to recursive methods in different files
Wrmcrms = Weight of a recursive method calling another recursive method in the same file
Nrmcrms = Number of calls from recursive method(s) to other recursive methods in the same file
Wrmcrmd = Weight of a recursive method calling another recursive method in a different file
Nrmcrmd = Number of calls from recursive method(s) to other recursive methods in different files
Wrmcms = Weight of a recursive method calling a regular method in the same file
Nrmcms = Number of calls from recursive method(s) to regular methods in the same file
Wrmcmd = Weight of a recursive method calling a regular method in a different file
Nrmcmd = Number of calls from recursive method(s) to regular methods in different files
Wmrgvs = Weight of a regular method referencing a global variable in the same file
Nmrgvs = Number of references from regular method(s) to global variables in the same file
Wmrgvd = Weight of a regular method referencing a global variable in a different file
Nmrgvd = Number of references from regular method(s) to global variables in different files
Wrmrgvs = Weight of a recursive method referencing a global variable in the same file
Nrmrgvs = Number of references from recursive method(s) to global variables in the same file
Wrmrgvd = Weight of a recursive method referencing a global variable in a different file
Nrmrgvd = Number of references from recursive method(s) to global variable in different files*/   
    
    int Wr,Nr,Wmcms,Nmcms,Wmcmd,Nmcmd,Wmcrms,Nmcrms,Wmcrmd,Nmcrmd,Wrmcrms,Nrmcrms,Wrmcrmd,Nrmcrmd,Wrmcms,Nrmcms,Wrmcmd,Nrmcmd,Wmrgvs,Nmrgvs,Wmrgvd,Nmrgvd,Wrmrgvs,Nrmrgvs,Wrmrgvd,Nrmrgvd;
    ArrayList<String> couplingResults = new ArrayList<>();
    CouplingServiceImp couplingImp = new CouplingServiceImp();
    
    
    public ArrayList<String> CouplingComplexityInitializer(String filepath) throws Exception
    {
        
        CustomFile custFile = new CustomFile(filepath);
        ArrayList<CustomFile> fileList = new ArrayList<>();
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        
        Wr = 2;
        Wmcms = 2;
        Wmcmd = 3;
        Wmcrms = 3;
        Wmcrmd = 4;
        Wrmcrms = 4;
        Wrmcrmd = 5;
        Wrmcms = 3;
        Wrmcmd = 4;
        Wmrgvs = 1;
        Wmrgvd = 2;
        Wrmrgvs = 1;
        Wrmrgvd = 2;
 /*               
      Nr = couplingImp.getRecursiveMethods(custFile);       
      Nmcms = couplingImp.getRegInReg(custFile);
      Nmcmd = couplingImp.getRegInReg_DF(fileList);
      Nmcrms = couplingImp.getRegInRec(custFile);
      Nmcrmd= couplingImp.getRegInRec_DF(fileList);
      Nrmcrms = couplingImp.getRecInRec(custFile);
      Nrmcrmd = couplingImp.getRecInRec_DF(fileList);
      Nrmcms = couplingImp.getRecInReg(custFile);
      Nrmcmd = couplingImp.getRecInReg_DF(fileList);
      Nmrgvs = couplingImp.getGlobalVariableListInReg(custFile);
      Nmrgvd = couplingImp.getGlobalVariableListInReg_DF(fileList);
      Nrmrgvs = couplingImp.getGlobalVariableListInRec(custFile);
      Nrmrgvd = couplingImp.getGlobalVariableListInRec_DF(fileList);
*/
        couplingResults.add(Integer.toString(Wr));
        couplingResults.add(Integer.toString(Nr));
        couplingResults.add(Integer.toString(Wmcms));
        couplingResults.add(Integer.toString(Nmcms));
        couplingResults.add(Integer.toString(Wmcmd));
        couplingResults.add(Integer.toString(Nmcmd));
        couplingResults.add(Integer.toString(Wmcrms));
        couplingResults.add(Integer.toString(Nmcrms));
        couplingResults.add(Integer.toString(Wmcrmd));
        couplingResults.add(Integer.toString(Nmcrmd));
        couplingResults.add(Integer.toString(Wrmcrms));
        couplingResults.add(Integer.toString(Nrmcrms));
        couplingResults.add(Integer.toString(Wrmcrmd));
        couplingResults.add(Integer.toString(Nrmcrmd));
        couplingResults.add(Integer.toString(Wrmcms));
        couplingResults.add(Integer.toString(Nrmcms));
        couplingResults.add(Integer.toString(Wrmcmd));
        couplingResults.add(Integer.toString(Nrmcmd));
        couplingResults.add(Integer.toString(Wmrgvs));
        couplingResults.add(Integer.toString(Nmrgvs));
        couplingResults.add(Integer.toString(Wmrgvd));
        couplingResults.add(Integer.toString(Nmrgvd));
        couplingResults.add(Integer.toString(Wrmrgvs));
        couplingResults.add(Integer.toString(Nrmrgvs));
        couplingResults.add(Integer.toString(Wrmrgvd));
        couplingResults.add(Integer.toString(Nrmrgvd));
                
        return couplingResults;
    }
}
