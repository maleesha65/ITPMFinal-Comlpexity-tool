/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coupling;

import java.util.ArrayList;

/**
 *
 * @author nuwan
 */
public class LineArrayListToArray {
    
    public static Line[] convert(ArrayList<Line> list) {
		Line[] newList = new Line[list.size()];
		
		for(int i = 0; i < list.size(); ++i) {
			newList[i] = list.get(i);
		}
		
		return newList;	
	}
    
}
