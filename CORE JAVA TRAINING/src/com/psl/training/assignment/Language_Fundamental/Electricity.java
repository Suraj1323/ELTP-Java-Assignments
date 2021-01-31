package com.psl.training.assignment.Language_Fundamental;

/**
 * @author Suraj
 * Electricity board wants to develop program to calculate 
 * Electricity Bill. They have two types of connections 
 * domestic and commercial, 
 * charges for domestic bill are as follows:
 * 		if consumed units are less or equals 100 then 
 * 	Rs.4/units or Rs. 250 whichever is greater
 *		if consumed units are between 100 to 300 then Rs.4.50/units
 *		if more than 300 and less than 500 Rs.4.75/units and 
 *	above 500 Rs.5/units
 *
 * For commercial connections charges are calculated as follows:
 *		Consumed units are less or equals 100 then 
 *	Rs.4.25/units or Rs. 350 whichever is greater.
 *		if consumed units are between 100 to 300 
 *	then Rs.4.75/units.
 *		if more than 300 and less than 500 Rs.5/units 
 *	and above 500 Rs.5.25/units calculate electricity bill.
 */
public class Electricity {
	static double calElectricity(String type, int unitConsumed){
		//For commercial bill
		if(type.equals("commercial")) {
			if(unitConsumed <= 100) {
				return unitConsumed*4.25>350?unitConsumed*4.25:350;
			}
			else if(unitConsumed > 100 && unitConsumed <= 300) {
				return unitConsumed*4.75;
			}
			else if(unitConsumed > 300 && unitConsumed <= 500) {
				return unitConsumed*5;
			}
			else {
				return unitConsumed*5.25;
			}
		}
		//For domestic bill
		else {
			if(unitConsumed <= 100) {
				return unitConsumed*4>250?unitConsumed*4:250;
			}
			else if(unitConsumed > 100 && unitConsumed <= 300) {
				return unitConsumed*4.5;
			}
			else if(unitConsumed > 300 && unitConsumed <= 500) {
				return unitConsumed*4.75;
			}
			else {
				return unitConsumed*5;
			}
		}
	}
}
