package com.psl.training.assignment.Language_Fundamental;

/**
 * @author Suraj
 * check whether the input alphabet is a vowel or not
 */
public class Vowel {
	static boolean checkAlpha(char alph) {
		if(alph == 'a' || alph == 'e' || alph == 'i' ||alph == 'o' ||alph == 'u') {
			return true;
		}
		return false;
	}
}
