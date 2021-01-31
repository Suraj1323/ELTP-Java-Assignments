package com.psl.training.assignment.Language_Fundamental;

/**
 * @author Suraj
 * Find the number is prime or not.
 */
public class PrimeNumber {
	public static boolean isPrimeNumber(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
