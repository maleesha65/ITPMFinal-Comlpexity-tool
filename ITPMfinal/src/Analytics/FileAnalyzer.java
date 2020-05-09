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
import javax.swing.JOptionPane;

/**
 *
 * @author nuwan
 */
public class FileAnalyzer {
    
    public int NumberOfLines;
    
    
    public int LineCounter(String path)
    {
        try
        {
            BufferedReader bfr = new BufferedReader(new FileReader(path));
            String line;
            while((line = bfr.readLine())!=null)
            {
                if(!"".equals(line.trim()))
                {
                    NumberOfLines++;
                }
            }
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return NumberOfLines;
    }
}
