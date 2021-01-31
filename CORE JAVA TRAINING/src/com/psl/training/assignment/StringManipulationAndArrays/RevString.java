package com.psl.training.assignment.StringManipulationAndArrays;

/**
 * @author Suraj
 * Write a program that will reverse the sequence of letters 
 * in each word of a chosen paragraph . For instance, 
 * " To be or not to be " Would become " oT eb ro ton ot eb"
 */
public class RevString {
	public static String  makeReverse(String str) {
		StringBuilder sb = new StringBuilder();
		String[] sArr = str.split(" ");
		StringBuilder rev = new StringBuilder();
		for(int i=0; i<sArr.length; i++) {
			rev.append(sb.append(sArr[i]).reverse());
			sb.delete(0, sb.length());
			rev.append(" ");
		}
		return rev.toString();
	}
}
