package com.psl.training.assignment.InventoryManagement;

public class StockItem {
	private static int count = 1;
	private int itemNumber;
	private String itemDesc;
	private double itemPrice;
	private int availableStock;
	
	public StockItem() {
		
	}
	public StockItem(String itemDesc, double itemPrice, int availableStock) {
		this.itemNumber = count++;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
		this.availableStock = availableStock;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	
	//Not used for now
	private void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getAvailableStock() {
		return availableStock;
	}
	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
	@Override
	public String toString() {
		return "StockItem [itemNumber=" + itemNumber + ", itemDesc=" + itemDesc + ", itemPrice=" + itemPrice
				+ ", availableStock=" + availableStock + "]";
	}

}
