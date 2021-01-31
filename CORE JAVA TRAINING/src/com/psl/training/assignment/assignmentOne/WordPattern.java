package com.psl.training.assignment.assignmentOne;

/**
 * @author Suraj
 * For entered String Split String using spaces and print word on each line
 *	for eg   String str=" This is a Java World";
 *	expected Output:
 *	This
 *	is
 *	a
 *	Java
 *	World
 */
public class WordPattern {
	public static void printWordPattern(String str) {
		String[] arr = str.split(" ");
		for(String s: arr) {
			System.out.println(s);
		}
	}
}
