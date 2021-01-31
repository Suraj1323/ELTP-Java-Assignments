package com.psl.training.assignment.MedicineHierarchy;

public class Medicine {
	String companyName;
	String companyAddress;
	
	public Medicine() {
		
	}
	public Medicine(String companyName, String companyAddress) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}
	void displayLabel() {
		System.out.println("Name of Company: " + companyName);
		System.out.println("Address of Company: " + companyAddress);
	}
	
}
