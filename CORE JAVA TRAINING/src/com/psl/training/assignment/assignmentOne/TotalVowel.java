package com.psl.training.assignment.assignmentOne;

/**
 * @author Suraj
 * Find the total vowels present in a String
 */
public class TotalVowel {
	public static int countVowel(String input) {
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == 'a' 
					|| input.charAt(i) == 'e' 
					|| input.charAt(i) == 'i'
					|| input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				count+=1;
			}
		}
		return count;
	}
}
