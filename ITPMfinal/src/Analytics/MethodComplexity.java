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
public class MethodComplexity {
    
    ArrayList<String> returnValues = new ArrayList<>();
    Controller ctrl = new Controller();
    String[] AccessLvels = ctrl.getAccessLevels();
    String[] PrimitiveTypes = ctrl.getPrimitiveDataTypes();
    
    /*
    Cm = Complexity of a line which includes a method signature 
    Wmrt = Weight due to method return type 
    Wpdtp = Weight of primitive data type parameters 
    Npdtp = Number of primitive data type parameters 
    Wcdtp = Weight of composite data type parameters 
    Ncdtp = Number of composite data type parameters
    */
    
    int Cm,Wmrt,Wpdtp,Npdtp,Wcdtp,Ncdtp;
    
    public ArrayList<String> MethodComplexityInitializer(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        String CurrentLine , line;
        
        while((line = br.readLine())!= null)
                {
                    
                    CurrentLine=line;
//                    
                    findToken(CurrentLine,1);
//                    
                }
        returnValues.add(Integer.toString(Wmrt));
        returnValues.add(Integer.toString(Wpdtp));
        returnValues.add(Integer.toString(Npdtp));
        returnValues.add(Integer.toString(Wcdtp));
        returnValues.add(Integer.toString(Ncdtp));
        
        return returnValues;
    }
    
    public void findToken(String Currentline, int i)
    {
        StringTokenizer token = new StringTokenizer(Currentline);
        
        while(token.hasMoreTokens())
        {
            String word = token.nextToken();
            
            for (String AccessLvel : AccessLvels)
            {
                for(String Primitive : PrimitiveTypes)
                {
                    if(Primitive.equals("void"))
                    {
                        Wmrt = Wmrt + 0;
                    }
                    else if(word.equals(Primitive))
                    {
                        Wmrt++;
                        Npdtp++;
                    }
                    else
                    {
                        Wcdtp++;
                        Ncdtp++;
                    }
                }
            }
        }
    }
}
