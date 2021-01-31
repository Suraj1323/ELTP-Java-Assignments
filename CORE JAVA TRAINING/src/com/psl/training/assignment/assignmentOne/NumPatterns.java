package com.psl.training.assignment.assignmentOne;

/**
 * @author Suraj
 *  1
 *	1 2
 *	1 2 3
 *	1 2 3 4
 *	1 2 3
 *	1 2
 *	1
 */
public class NumPatterns {
	public static void printNumPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int j=i, k=1; j>=1; j--) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
}
