package com.psl.training.assignment.StringManipulationAndArrays;

import java.util.ArrayList;
/**
 * @author Suraj
 * Write a function to find various combinations of entered string
 * For Eg  str= “123”
 * Output :
 * 123     
 * 132
 * 213
 * 231
 * 312
 * 321
 */
public class StrCombination { 
	static ArrayList<String> res = new ArrayList<>();
	
	public static String[] permutation(String str) { 
	    permutation("", str); 
	    String[] result = new String[res.size()];
	    for(int i=0; i<res.size(); i++) {
	    	result[i] = res.get(i);
	    }
	    return result;
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) 
	    {
	    	//System.out.println(prefix);
	    	res.add(prefix);
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), 
	            		str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
