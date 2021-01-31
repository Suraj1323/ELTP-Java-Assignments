package com.psl.training.assignment.Language_Fundamental;

/**
 * @author Suraj
 * Some credit card companies pay back a small portion of 
 * the charges a customer makes over a year. A particular 
 * credit card company's pay back policy is as follows:
 *		1. 0.25% for charges up to Rs. 500.
 *		2. 0.50% for the next Rs.1000 (that is, the portion 
 *			between Rs. 500 and Rs. 1500),
 *		3. 0.75% for the next Rs.1000 (that is, the portion 
 *			between Rs. 1500 and Rs. 2500),
 *		4. 1.0% for charges above Rs2500.
 * Thus, a customer who charges Rs. 400 a year receives Rs.1.00,
 * which is 0.25 x 1/100 x 400, and 
 * one who charges Rs.1400 a year receives Rs. 5.75,
 * which is 1.25 = 0.25 x 1/100 x 500 for the first Rs. 500 
 * and 0.50 x 1/100 x 900 = 4.50 for the next Rs. 900. 
 * Determine by hand the pay backs amount for a customer 
 * who charged Rs.2000 and one who charged Rs. 2600.
 * Define the program, which accepts a charge amount and 
 * computes the corresponding pay back amount.
 */
public class CreditCard {
	static double calPayBack(int charges) {
		if (charges<=500) {
			return 0.0025*charges;
		}
		else if (charges>500 && charges<=1500) {
			return 0.0025*500 + 0.0050*(charges-500);
		}
		else if (charges>1500 && charges<=2500) {
			return 0.0025*500 + 0.0050*1000 + 0.0075*(charges-1500);
		}
		else {
			return 0.0025*500 + 0.0050*1000 + 0.0075*1000 + 0.01*(charges-2500);
		}
	}
//	static double calPayBack(int charges) {
//		if(charges<=0) {
//			return 0;
//		}
//		else if(charges>0 && charges<=500){
//			return (charges*0.25/100)+calPayBack(charges-1000);
//		}
//		else if(charges>500 && charges<=1500){
//			return (charges*0.5/100)+calPayBack(charges-1000);
//		}
//		else if(charges>1500 && charges<=2500){
//			return (charges*0.75/100)+calPayBack(charges-1000);
//		}
//		else {
//			return (charges/100)+calPayBack(charges-1000);
//		}
//	}
}
