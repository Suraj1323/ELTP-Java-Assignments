package com.psl.training.assignment.Language_Fundamental;

/**
 * @author Suraj
 * To Find the maximum of three numbers 
 */
public class MaxNum {
	static int calMax(int x,int y,int z) {
		if(x>y) {
			if(x>z) {
				return x;
			}
			else {
				return z;
			}
		}
		else if(y>z) {
			return y;
		}
		else {
			return z;
		}
	}
}
