package com.psl.training.assignment.OMS;

public class Customer {
	int id;
	String name;
	String homePhone, cellPhone, workPhone;
	String street, city, state;
	String zip;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void setPhoneNumbers(String homePhone, String cellPhone, String workPhone) {
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
	}
	void printPhoneNumber() {
		System.out.println("HomePhone: " + this.homePhone);
		System.out.println("CellPhone: " + this.cellPhone);
		System.out.println("WorkPhone: " + this.workPhone);
	}
	
	void setShippingAddress(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	void printShippingAddress() {
		System.out.println("Street: " + this.street);
		System.out.println("City: " + this.city);
		System.out.println("State: " + this.state);
		System.out.println("Zip: " + this.zip);
	}

	public void printAll() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		printPhoneNumber();
		printShippingAddress();
	}
	
}
