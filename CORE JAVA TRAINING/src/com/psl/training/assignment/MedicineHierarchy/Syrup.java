package com.psl.training.assignment.MedicineHierarchy;

public class Syrup extends Medicine {
	public Syrup(String companyName, String companyAddress) {
		super(companyName, companyAddress);
	}

	@Override
	void displayLabel() {
		super.displayLabel();
//		System.out.println("Name of Company: " + companyName);
//		System.out.println("Address of Company: " + companyAddress);
		System.out.println("Not for children");
	}
}
