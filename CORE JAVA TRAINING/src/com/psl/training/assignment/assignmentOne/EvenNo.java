package com.psl.training.assignment.assignmentOne;

/**
 * @author Suraj
 * Find the total of even numbers present in an array
 */
public class EvenNo {
	 public static int evenSum(int[] numbers) {
		int sum = 0;
		for(int n: numbers) {
			if(n%2 == 0) {
				sum += n;
			}
		}
		return sum;
	}
}
