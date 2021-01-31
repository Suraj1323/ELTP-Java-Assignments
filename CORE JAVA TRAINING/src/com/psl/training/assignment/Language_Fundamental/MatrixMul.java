package com.psl.training.assignment.Language_Fundamental;

/**
 * @author Suraj
 * Write a program to create a rectangular array containing 
 * a multiplication table from 1*1 up to 12*12. Output the 
 * table as 13 columns with the numeric values right-aligned 
 * in columns. 
 * (The first line of output will be the column headings, 
 * the first column with no heading, then the numbers
 * 1 to 12 for the remaining columns. The first item in each of 
 * the succeeding lines is the row heading, which ranges from 1 to 12.)
 */
public class MatrixMul {
	static void displayMultiplicationMatrix() {
		int[][] matrix = new int[13][13];
		
		for(int i=1; i<13; i++) {
			matrix[i][0] = i;
			matrix[0][i] = i;
			for(int j=1; j<13; j++) {
				matrix[i][j] = i*j;
			}
		}
		for(int i=0; i<13; i++) {
			for(int j=0; j<13; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
