package com.psl.training.assignment.assignmentOne;

/**
 * @author Suraj
 * for eg if i/p str = Hello
 *	H
 *	H e
 *	H e l
 *	H e l l
 *	H e l l o
 */
public class StringPattern {
	public static void printStringPattern(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}
