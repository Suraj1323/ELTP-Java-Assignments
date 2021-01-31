package com.psl.training.assignment.InventoryManagement;

import java.time.LocalDate;
import java.util.ArrayList;

public class PurchaseOrder {
	private static int count = 1;
	private int poNumber;
	private LocalDate orderDate;
	private LocalDate shipDate;
	private ArrayList<OrderItem> orderItem = new ArrayList<>();
	
	public PurchaseOrder() {
		// TODO Auto-generated constructor stub
	}

	public PurchaseOrder(LocalDate orderDate, LocalDate shipDate, ArrayList<OrderItem> orderItem) {
		this.poNumber = count++;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.orderItem = orderItem;
	}
	
	public int getPoNumber() {
		return poNumber;
	}

	//Not used for now
	private void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(LocalDate shipDate) {
		this.shipDate = shipDate;
	}

	public ArrayList<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(ArrayList<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [poNumber=" + poNumber + ", orderDate=" + orderDate + ", shipDate=" + shipDate
				+ ", orderItem=" + orderItem + "]";
	}
	
	
}
