package com.psl.training.assignment.assignmentOne;

/**
 * @author Suraj
 * Find the total spaces present in a String
 */
public class TotalSpace {
	public static int countSpace(String input) {
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == ' ') {
				count+=1;
			}
		}
		return count;
	}
}
