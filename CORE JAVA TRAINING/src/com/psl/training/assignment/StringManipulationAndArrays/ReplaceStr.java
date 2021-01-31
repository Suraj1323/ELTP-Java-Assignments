package com.psl.training.assignment.StringManipulationAndArrays;

/**
 * @author Suraj
 * Write a function find and replace which will replace the given 
 * string from the source string.
 */
public class ReplaceStr {
	public static String replaceString(String word, String oldS, String newS) {
		return word.replaceAll(oldS, newS);
	}
}
