/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytics;

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
    
    public ArrayList<String> CouplingComplexityInitializer(String filepath) throws Exception
    {
        
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        
        
        
        return couplingResults;
    }
}
