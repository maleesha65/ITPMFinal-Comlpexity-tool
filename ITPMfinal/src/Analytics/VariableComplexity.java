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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author nuwan
 */
public class VariableComplexity {
    
    ArrayList<String> returnValues = new ArrayList<>();
    Field [] fieldList;
    Method [] methodList;
    Controller ctrl = new Controller();
    String [] primitiveDataTypes = ctrl.getPrimitiveDataTypes();
    String [] ignoreElements = ctrl.getIgnore();
    
    /*
    Cv = Complexity of a program statement due to its variables 
    Wvs = Weight due to variable scope 
    Wpdtv = Weight of primitive data type variables 
    Npdtv = Number of primitive data type variables 
    Wcdtv = Weight of composite data type variables 
    Ncdtv = Number of composite data type variables 
    */
    
    int Wvs,Wpdtv,Npdtv,Wcdtv,Ncdtv;
    
    public ArrayList<String> VariableComplexityInitializer(String [] str) throws FileNotFoundException, IOException
    {

        String [] words;
        String regex = "\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b";
        for(int i=0; i<str.length; i++)
        {
            String sentence = str[i];
            words = sentence.split(" ");
            
            for(int j = 0; j<words.length; j++)
            {
                for(int k = 0; k < primitiveDataTypes.length; k++)
                {
                    if(words[j].equals(primitiveDataTypes[k]))
                    {
                        //if((words[j+2].equals(regex)))
                        //{
                            Wvs++;
                            Wpdtv++;
                            Npdtv++;
                        //}
                    }
                    else if((words[j] == null ? primitiveDataTypes[k] != null : !words[j].equals(primitiveDataTypes[k]))&&(!regex.equals(words[j])))
                    {
                        for( int ig = 0; ig < ignoreElements.length; ig++ )
                        {
                            if(words[j].equals(ignoreElements[ig]))
                            {
                                break;
                            }
                            else
                            {
                                Wcdtv = Wcdtv + 2;
                                Ncdtv++;
                            }
                        }
                    }
                }
            }
        }
        
        returnValues.add(Integer.toString(Wvs));
        returnValues.add(Integer.toString(Wpdtv));
        returnValues.add(Integer.toString(Npdtv));
        returnValues.add(Integer.toString(Wcdtv));
        returnValues.add(Integer.toString(Ncdtv));
        
        return returnValues;
        
    }
    
    
}