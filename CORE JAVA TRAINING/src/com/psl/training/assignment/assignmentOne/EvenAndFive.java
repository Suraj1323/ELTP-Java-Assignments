package com.psl.training.assignment.assignmentOne;

import java.util.ArrayList;

/**
 * @author Suraj
 * Print all even and multiple of 5 numbers from an array
 */
public class EvenAndFive {
	public static int[] findEvenMultipleFive(int[] numbers) {
		ArrayList<Integer> res = new ArrayList<>();
		for(int n: numbers) {
			if(n%2 == 0 && n%5 == 0) {
				res.add(n);
			}
		}
		return res.stream().mapToInt(i->i).toArray();
	}
}
