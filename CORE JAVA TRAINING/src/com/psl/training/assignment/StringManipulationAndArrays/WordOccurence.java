package com.psl.training.assignment.StringManipulationAndArrays;

/**
 * @author Suraj
 * Find the number of occurrences of given word in a sentence.
 */
public class WordOccurence {
	public static int check(String sentence,String word) {
		String[] words = sentence.split(" ");
		int count = 0;
		for(String w : words) {
			if(w.equals(word)) {
				count+=1;
			}
		}
		return count;
	}
}
