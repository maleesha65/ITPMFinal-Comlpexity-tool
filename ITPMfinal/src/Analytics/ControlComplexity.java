/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author nuwan
 */
public class ControlComplexity {
    
    ArrayList<String> returnValues = new ArrayList<>();
    Controller ctrl = new Controller();
    
    int Wtcs,NC,Ccspps;
    String [] controlStructs = ctrl.getControlStucts();
    
    public ControlComplexity() {
    }
    
    public ArrayList<String> ControlComplexityInitializer(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        String CurrentLine , line;
        
        while((line = br.readLine())!= null)
                {
                    
                    CurrentLine=line;                   
                    findToken(CurrentLine,1);
                    
                }
        returnValues.add(Integer.toString(Wtcs));
        returnValues.add(Integer.toString(NC));
        returnValues.add(Integer.toString(Ccspps));
        
        return returnValues;
    }
    
    public void findToken(String CurrentLine, int i)
    {
        StringTokenizer token = new StringTokenizer(CurrentLine);
        
        while(token.hasMoreTokens())
        {
            String word = token.nextToken();
            
            for (String controlStruct : controlStructs) 
            {
                if(word.equals(controlStruct))
                {
                    if((word.equals("if"))||(word.equals("else")))
                    {
                        if(Wtcs!=0)
                        {
                            Ccspps++;
                        }
                        Wtcs = Wtcs + 2;
                        NC++;
                    }
                    else if((word.equals("for"))||(word.equals("while"))||(word.equals("do")))
                    {
                        if(Wtcs!=0)
                        {
                            Ccspps++;
                        }
                        Wtcs = Wtcs + 3;
                        NC++;
                    }
                    else if(word.equals("switch"))
                    {
                        if(Wtcs!=0)
                        {
                            Ccspps++;
                        }
                        Wtcs = Wtcs + 2;
                        NC++;
                    }
                    else if(word.equals(("case")))
                    {
                        if(Wtcs!=0)
                        {
                            Ccspps++;
                        }
                        Wtcs = Wtcs + 1;
                        NC++;
                    }
                }
            }
        }
    }
}
