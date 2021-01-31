package com.psl.training.assignment.StringManipulationAndArrays;

/**
 * @author Suraj
 * Ezee Shop has an online portal where customers can check 
 * about different products. Customers can search for products 
 * by giving a key word. Write a program that accepts a product 
 * name and a key word, and checks if the key word is present in 
 * the given product name.
 */
public class Product {
	//static String[] productNames = new String[5];
	public static String[] initProductNames() {
		String[] productNames = new String[5];
		productNames[0] = "Laptop";
		productNames[1] = "Mobile";
		productNames[2] = "Television";
		productNames[3] = "Refrigerator";
		productNames[4] = "Washing Machine";
		return productNames;
	}
	public static boolean isPresent(String[] productNames, String keyword) {
		for(String product : productNames) {
			if(product.contains(keyword)) {
				return true;
			}
		}
		return false;
	}
}
