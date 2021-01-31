package com.psl.training.assignment.Language_Fundamental;

/**
 * @author Suraj
 * An old-style movie theater has a simple profit 
 * program. Each customer pays $5 per ticket. Every 
 * performance costs the theater $20, plus $.50 per 
 * attendee. Develop the program that accepts the number 
 * of attendees (of a show) and calculates how much 
 * income the show earns.
 */
public class Theatre {
	static float calculateProfit(int numAttendees) {
		return (float) (numAttendees*5-(20+numAttendees*0.5));
	}
}
