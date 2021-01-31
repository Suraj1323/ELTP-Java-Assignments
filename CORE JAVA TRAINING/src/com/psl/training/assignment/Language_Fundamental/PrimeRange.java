package com.psl.training.assignment.Language_Fundamental;
/**
 * @author Suraj
 * Method will accept range value and print all prime 
 * numbers from 2 to range on console.
 */
public class PrimeRange {
	static void printPrime(int maxVal) {
		
		for(int i=2; i<=maxVal; i++) {
			if(PrimeNumber.isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
}
