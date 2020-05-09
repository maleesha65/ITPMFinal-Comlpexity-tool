/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytics;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author nuwan
 */
public class Controller {
    
    String[] strArr;
    String[] arithmatic = {"+", "-", ".", "/","%"};
    String[] logical = {"&&", "||", "!"};
    String[] relation = {"==", "!=", ">", "<", ">=", "<="};
    String[] bitwise = {"|", "^", "~", "<<", ">>", ">>>", "<<<"};
    String[] miscellaneous = {",", "->", ".", "::"};
    String[] assignment = {"+=", "-=", "*=", "/=", "=", ">>>=", "|=", "&=", "%=", "<<=", ">>=", "^="};
    String[] keywords = {"void", "double","printf", "println", "cout", "cin", "if","else", "for", "while", "do", "switch", "case", "class"};
    String[] manipulators = {"endl", "\n"};
    String[] controlStucts = {"if","else if","else","for","switch","case","while","do"};
    String[] text = {"System.out.println();"};
    String[] primitiveDataTypes = {"byte","char","short","int","long","float","double","boolean","void"};
    String[] AccessLevels = {"public","private","protected","abtract"};
    String[] Ignore = {"change","this","choose","Project","Properties.","To","template","templates","package",
        "Interfaces","import","java.awt.Color;","java.io.BufferedReader;","java.io.File;","java.io.FileNotFoundException;",
        "Exception","java.io.FileReader;","java.util.ArrayList;","Code\">//GEN-BEGIN:initComponents","initComponents",
        "javax.swing.JCheckBox();","javax.swing.JCheckBox();","setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);"};
    
    String [] words;

    String regex = "\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b";
    
    public String[] getControlStucts() {
        return controlStucts;
    }

    public void setControlStucts(String[] controlStucts) {
        this.controlStucts = controlStucts;
    }
    
    public String[] getIgnore() {
        return Ignore;
    }

    public void setIgnore(String[] Ignore) {
        this.Ignore = Ignore;
    }

    public String[] getAccessLevels() {
        return AccessLevels;
    }

    public void setAccessLevels(String[] AccessLevels) {
        this.AccessLevels = AccessLevels;
    }
    String[] otherKeyWords = {"printf","println","cout","cin","if","for","while","do-while","switch","case","System","out"};
    

    public String[] getPrimitiveDataTypes() {
        return primitiveDataTypes;
    }

    public void setPrimitiveDataTypes(String[] primitiveDataTypes) {
        this.primitiveDataTypes = primitiveDataTypes;
    }

    public String[] getOtherKeyWords() {
        return otherKeyWords;
    }

    public void setOtherKeyWords(String[] otherKeyWords) {
        this.otherKeyWords = otherKeyWords;
    }

    String[][] options = {logical, arithmatic, relation, bitwise, miscellaneous, assignment, keywords, manipulators, text};

    ArrayList<String> lst = new ArrayList<>();
    
    public String[] getStrArr() {
        return strArr;
    }

    public void setStrArr(String[] strArr) {
        this.strArr = strArr;
    }

    public String[] getArithmatic() {
        return arithmatic;
    }

    public void setArithmatic(String[] arithmatic) {
        this.arithmatic = arithmatic;
    }

    public String[] getLogical() {
        return logical;
    }

    public void setLogical(String[] logical) {
        this.logical = logical;
    }

    public String[] getRelation() {
        return relation;
    }

    public void setRelation(String[] relation) {
        this.relation = relation;
    }

    public String[] getBitwise() {
        return bitwise;
    }

    public void setBitwise(String[] bitwise) {
        this.bitwise = bitwise;
    }

    public String[] getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(String[] miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    public String[] getAssignment() {
        return assignment;
    }

    public void setAssignment(String[] assignment) {
        this.assignment = assignment;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String[] getManipulators() {
        return manipulators;
    }

    public void setManipulators(String[] manipulators) {
        this.manipulators = manipulators;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public String[][] getOptions() {
        return options;
    }

    public void setOptions(String[][] options) {
        this.options = options;
    }
    
    public int CodeAnalyzer(String [] str)
    {
        int complexity=0;
        
        for (int i = 0; i < options.length; i++) 
        {
            String[] array = options[i];
            System.out.println(strArr.length);
            for (int j = 0; j < strArr.length; j++)
            {
                for (int k = 0; k < array.length; k++)
                {
                    if (array[k].equals(strArr[j])  || strArr[j].contains(array[k]))
                    {
                        ++complexity;
                    }
                }
            }
        }
        
        return complexity;
    }
    
    public int KeyWordAnalyzer(String [] str)
    {
        int KeyWordCount = 0;
        ArrayList<String> keywordLst = new ArrayList<>();
        String array [] = keywords;
        
        for(int i=0; i < str.length; i++)
        {
            keywordLst.add(str[i]);
        }
        
        for(String line : keywordLst)
        {
            StringTokenizer keywordtoken = new StringTokenizer(line);
            
            while (keywordtoken.hasMoreTokens())
            {
                String word = keywordtoken.nextToken();
                for(int j = 0; j < array.length; j++)
                {
                    if(word.equals(array[j]))
                    {
                        KeyWordCount++;
                    }
                }
            }
        }
        
        return KeyWordCount;
    }
    
    public int InheritanceAnalyzer(String [] str)
    {
        int inheritanceCount = 0;
        
        for(int i=0; i<str.length; i++)
        {
            lst.add(str[i]);
        }
        
        for(String line : lst)
        {
            words = line.split(" ");
            
            StringTokenizer token = new StringTokenizer(line);
            
            while(token.hasMoreTokens())
            {
                String previostoken = null;
                
                if(token.nextToken().equals("extends"))
                {
                    previostoken = token.nextToken();
                    inheritanceCount++;
                }
            }
        }
        
        return inheritanceCount;
        
        
    }
}
