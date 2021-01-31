package com.psl.training.assignment.InventoryManagement;

public class OrderItem {
	private StockItem stockItem;
	private int numberOfItems;
	private long totalAmount; // Derived Attribute no_of_items*price;
	
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public OrderItem(StockItem stockItem, int numberOfItems) {
		this.stockItem = stockItem;
		this.numberOfItems = numberOfItems;
		this.totalAmount = (long) (numberOfItems*stockItem.getItemPrice());
	}

	public StockItem getStockItem() {
		return stockItem;
	}

	public void setStockItem(StockItem stockItem) {
		this.stockItem = stockItem;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public long getTotalAmount() {
		return totalAmount;
	}

	//No use for now
	private void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "OrderItem [stockItem=" + stockItem + ", numberOfItems=" + numberOfItems + ", totalAmount=" + totalAmount
				+ "]";
	}
	
}
