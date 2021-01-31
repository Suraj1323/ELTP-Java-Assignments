package com.psl.training.assignment.Language_Fundamental;

public class Tax {
	/**
	 * @author Suraj
	 * Develop the program, which accepts the gross pay and 
	 * produces the amount of tax owed. For a gross pay of $240 
	 * or less, the tax is 0%; for over $240 and less than 
	 * $480, the tax rate is 15%; and for any pay over $480, 
	 * the tax rate is 28%.
	 */
	static double calTax(int gp) {
		if(gp <= 240) {
			return 0;
		}
		else if(gp >240 && gp <=480) {
			return gp*15/100;
		}
		else{
			return gp*28/100;
		}
	}
}
