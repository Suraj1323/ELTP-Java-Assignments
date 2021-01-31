package com.psl.training.assignment.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import com.psl.training.assignment.InventoryManagement.*;

public class InventoryTesterMain {
	ArrayList<PurchaseOrder> purchaseOrders = new ArrayList<>();
	ArrayList<StockItem> stockItems = new ArrayList<>();
	ArrayList<Customer> customers = new ArrayList<>();
	
	public InventoryTesterMain() {
		// TODO Auto-generated constructor stub
		initStock();
		initCustomers();
		createPurchaseOrders();
	}
	
	public static void main(String[] args) {
		InventoryTesterMain test=new InventoryTesterMain();

		System.out.println(" placing Order for Jamie");
		Customer customer1=test.placeOrder("Jamie", 1,2);
		System.out.println(" Orders of Jamie");
		for (PurchaseOrder po : customer1.getPo()) {
			System.out.println(po);
		}
		
		System.out.println(" placing Order for Bill");
		Customer customer2=test.placeOrder("Bill", 3);
		System.out.println(" Orders of Bill");
		for (PurchaseOrder po : customer2.getPo()) {
			System.out.println(po);
		}
		
		// considering a fixed requirement that we have only 3 orders 
		
		// Po1 - with Jamie
		// po2 - with Jamie
		// po3- with Bill

		// Get all the orders to be shipped and print labels
		//  purchaser Order Array
		
		System.out.println("----- Printing labels for Orders to be shipped ");
		// considering all the orders to be shipped by default
		long totalPrice=0;
		for (PurchaseOrder po : test.purchaseOrders) {
			totalPrice=0;
			String label="--------------------------------------";
			label+="\n Order No :"+po.getPoNumber();
			label+="\n Ordered Date : "+po.getOrderDate();
			po.setShipDate(po.getOrderDate().plusDays(1));
			label+="\n shipped on :"+po.getShipDate();
			label+="\n Items to be shipped ";
			for (OrderItem orderedItem : po.getOrderItem()) {
				label+="\n Item : "+orderedItem.getStockItem().getItemDesc()+", Qty :"+orderedItem.getNumberOfItems()+
						",  price :"+orderedItem.getTotalAmount();
				totalPrice+=orderedItem.getTotalAmount();
			}
			label+="\n Total Bill of Order :"+totalPrice;
			System.out.println(label);
			
		}
	}
	
	private Customer placeOrder(String customerName, int... orderNo) {
		// TODO Auto-generated method stub
		Customer c=getCustomerByName(customerName);
		ArrayList<PurchaseOrder> po=getPurchaseOrder(orderNo);
		c.setPo(po);
		return c;
	}

	private ArrayList<PurchaseOrder> getPurchaseOrder(int[] orderNo) {
		// TODO Auto-generated method stub
		ArrayList<PurchaseOrder> orders = new ArrayList<>(orderNo.length);
		for(int ono:orderNo)
		{
			for (PurchaseOrder po : this.purchaseOrders) {
				if(po.getPoNumber()==ono)
					orders.add(po);
			}
		}
		return orders;
	}

	private Customer getCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		for (Customer customer : customers) {
			if(customer.getName().equals(customerName)) {
				return customer;
			}
		}
		return null;
	}

	public void initStock(){
		stockItems.add(new StockItem("Milk",80,100));
		stockItems.add(new StockItem("Chicken",400,100));
		stockItems.add(new StockItem("Egg",100,50));
		stockItems.add(new StockItem("Apple",400,80));
		stockItems.add(new StockItem("Orange",350,100));	
	}
	
	public void initCustomers(){
		customers.add(new Customer("Jamie", null));
		customers.add(new Customer("Bill", null));
		customers.add(new Customer("Joe", null));
	}
	
	public void createPurchaseOrders(){
		// 1.	PO 1 - 2 gallons Milk, 2 lbs Chicken and 12 eggs.
		ArrayList<OrderItem> orderItems = new ArrayList<>();
		StockItem stockItem=getStockItemByName("Milk");
		orderItems.add(new OrderItem(stockItem, 2));
		
		stockItem=getStockItemByName("Chicken");
		orderItems.add(new OrderItem(stockItem, 2));
		
		stockItem=getStockItemByName("Egg");
		orderItems.add(new OrderItem(stockItem,12));
		
		purchaseOrders.add(new PurchaseOrder(LocalDate.now(), null, orderItems));
		
		//2.	PO 2 - 5 apples and 10 oranges
		orderItems=new  ArrayList<>();
		stockItem=getStockItemByName("Apple");
		orderItems.add(new OrderItem(stockItem, 5));
		
		stockItem=getStockItemByName("Orange");
		orderItems.add(new OrderItem(stockItem, 10));
		
		purchaseOrders.add(new PurchaseOrder(LocalDate.now(), null, orderItems));

		//3.	PO 3 - 5 Lbs chicken and 10 apples
		orderItems=new ArrayList<>();
		stockItem=getStockItemByName("Chicken");
		orderItems.add(new OrderItem(stockItem, 5));
			
		stockItem=getStockItemByName("Apple");
		orderItems.add(new OrderItem(stockItem, 10));
			
		purchaseOrders.add(new PurchaseOrder(LocalDate.now(), null, orderItems));
	}

	private StockItem getStockItemByName(String itemName) {
		// TODO Auto-generated method stub
		for (StockItem stockItem : stockItems) {
			if(stockItem.getItemDesc().equals(itemName))
				return stockItem;
		}
		return null;
	}
}
