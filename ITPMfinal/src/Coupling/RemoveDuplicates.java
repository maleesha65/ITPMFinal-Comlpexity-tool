/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coupling;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 *
 * @author nuwan
 */
public class RemoveDuplicates {
    
    public ArrayList<Line> initiate(ArrayList<Line> lineSet) {
 
        LinkedHashSet<Line> hashSet = new LinkedHashSet<>(lineSet);
         
        ArrayList<Line> listWithoutDuplicates = new ArrayList<>(hashSet);
         
        return listWithoutDuplicates;
    }
}
