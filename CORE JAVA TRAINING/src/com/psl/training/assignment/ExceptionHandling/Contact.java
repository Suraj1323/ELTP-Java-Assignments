package com.psl.training.assignment.ExceptionHandling;

import java.util.regex.Pattern;

public class Contact {
	String fName, mName, lName;
	String dob, anniversary;
	String gender;
	String address, area, city, pincode, state, country;
	String telNo, mobileNo;
	String email, website;
	
	
	public Contact(String fName, String mName, String lName, String dob, String anniversary, String gender,
			String address, String area, String city, String pincode, String state, String country, String telNo,
			String mobileNo, String email, String website) {
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.dob = dob;
		this.anniversary = anniversary;
		this.gender = gender;
		this.address = address;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.telNo = telNo;
		this.mobileNo = mobileNo;
		this.email = email;
		this.website = website;
	}


	public void validate() throws Exception {
		if(fName.equals(null) 
				|| lName.equals(null) 
				|| dob.equals(null) 
				|| email.equals(null)
				&& (telNo.equals(null) || mobileNo.equals(null))) {
			throw new Exception("Name, DOB, email, and phoneNo cannot be blank");
		}
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$";       
		Pattern pat = Pattern.compile(emailRegex); 
		if(!pat.matcher(email).matches()) {
			throw new Exception("Please enter valid Email");
		}
	}
	
}
