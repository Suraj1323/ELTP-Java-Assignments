package com.psl.training.assignment.StringManipulationAndArrays;

import java.util.ArrayList;
import com.psl.training.assignment.Language_Fundamental.PrimeNumber;

/**
 * @author Suraj
 * Write a function findPrime which will accept range of values 
 * from user and return int array from  function and print all 
 * numbers from it
 */
public class PrimeArr {
	public static int[] findPrime(int start, int end) {
		if(start>end) {
			return null;
		}
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=start; i<=end; i++) {
			if(PrimeNumber.isPrimeNumber(i)) {
				result.add(i);
			}
		}
		return result.stream().mapToInt(i->i).toArray();
	}
}
