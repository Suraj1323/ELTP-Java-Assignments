package com.psl.training.assignment.MedicineHierarchy;

public class Tablet extends Medicine {
	public Tablet(String companyName, String companyAddress) {
		super(companyName, companyAddress);
	}

	@Override
	void displayLabel() {
		super.displayLabel();
//		System.out.println("Name of Company: " + companyName);
//		System.out.println("Address of Company: " + companyAddress);
		System.out.println("Store in a cool and dry place");
	}
}
