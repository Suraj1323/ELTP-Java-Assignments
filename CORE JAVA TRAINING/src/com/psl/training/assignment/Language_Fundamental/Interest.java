package com.psl.training.assignment.Language_Fundamental;

/**
 * @author Suraj
 * 3.	Develop a program, that accepts a deposit amount 
 * and calculates amount of interest the deposit amount earns 
 * in a year. The bank pays a flat 4% interest for deposits 
 * of up to Rs.1000, a flat 4.5% per year for deposits of up to
 * Rs.5000, and a flat 5% for deposits of more than Rs.5000.
 */
public class Interest {
	static double calInterest(int amt) {
		if(amt <= 1000) {
			return amt*4/100;
		}
		else if(amt >1000 && amt <=5000) {
			return amt*4.5/100;
		}
		else{
			return amt*5/100;
		}
	}
}
