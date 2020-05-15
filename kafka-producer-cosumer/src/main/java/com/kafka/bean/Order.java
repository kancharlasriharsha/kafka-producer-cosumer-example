package com.kafka.bean;

public class Order {
	
	private String orderNumber;
	private String orderQuantity;
	private String product;
	public Order(String orderNumber, String orderQuantity, String product) {
		super();
		this.orderNumber = orderNumber;
		this.orderQuantity = orderQuantity;
		this.product = product;
	}
}
