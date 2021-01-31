package com.psl.training.assignment.StringManipulationAndArrays;

/**
 * @author Suraj
 * Find the availability of given number in the list. 
 */
public class NumAvailability {
	public static int findPosition(int num,int[] nos) {
		for(int i=0; i<nos.length; i++) {
			if(nos[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
