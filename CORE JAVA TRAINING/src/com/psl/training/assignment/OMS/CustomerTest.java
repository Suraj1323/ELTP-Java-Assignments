package com.psl.training.assignment.OMS;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Suraj");
		Customer c2 = new Customer(2, "Vishram");
		Customer c3 = new Customer(3, "Viras");
		
		c1.setPhoneNumbers("000000000", "12345", "546151");
		c2.setPhoneNumbers("3483135", "12345", "546151");
		c3.setPhoneNumbers("1548454", "12345", "546151");
		c1.setShippingAddress("Ss", "sc", "sst", "sz");
		c2.setShippingAddress("vs", "vc", "vst", "vz");
		c3.setShippingAddress("vis", "vic", "vist", "viz");
		
		c1.printAll();
		c2.printAll();
		c3.printAll();
	}

}
