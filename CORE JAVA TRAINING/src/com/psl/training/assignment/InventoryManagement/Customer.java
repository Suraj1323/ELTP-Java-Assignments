package com.psl.training.assignment.InventoryManagement;

import java.util.ArrayList;

public class Customer {
	private static int count = 1;
	private int customerNumber;
	private String name;
	//private String homePhone, cellPhone, workPhone;
	private String street, city, state;
	private String zip;
	private ArrayList<PurchaseOrder> po = new ArrayList<>();
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name, ArrayList<PurchaseOrder> po) {
		this.customerNumber = count++;
		this.name = name;
		this.po = po;
	}
	
//	void setPhoneNumbers(String homePhone, String cellPhone, String workPhone) {
//		this.homePhone = homePhone;
//		this.cellPhone = cellPhone;
//		this.workPhone = workPhone;
//	}
//	void printPhoneNumber() {
//		System.out.print("HomePhone: " + this.homePhone);
//		System.out.print("\tCellPhone: " + this.cellPhone);
//		System.out.println("\tWorkPhone: " + this.workPhone);
//	}
	
	void setShippingAddress(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	void printShippingAddress() {
		System.out.print("Street: " + this.street);
		System.out.print("\tCity: " + this.city);
		System.out.print("\tState: " + this.state);
		System.out.println("\tZip: " + this.zip);
	}
	void print() {
		System.out.println("CustomerNumber: " + customerNumber);
		System.out.println("Name: " + name);
		//printPhoneNumber();
		printShippingAddress();
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<PurchaseOrder> getPo() {
		return po;
	}

	public void setPo(ArrayList<PurchaseOrder> po) {
		this.po = po;
	}
	

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", name=" + name + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", po=" + po + "]";
	}
	
	
}
