 package com.project.order.dto;

import java.time.LocalDate;

//@Entity
public class Order 
{
	public Integer orderId;
	
	//@Coulumn
	public LocalDate orderDate;
	
	public Integer customerId;
	public Integer productId;
	public String productName;
	public Integer productPrice;
	
	

	
	public Order(Integer orderId, LocalDate orderDate, Integer customerId, Integer productId, String productName,
			Integer productPrice) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	
	public Order()
	{
	super();
	}


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Integer getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}


//	java.util.Date sysDate= new java.util.Date();
//	long time=sysDate.getTime();
//	System.out.println("********"+time+"*******");
//	java.sql.Date sqlDate=new java.sql.Date(time);
//	System.out.println("))))))))))))"+sqlDate+"((((((((((((((((((((");
	
	
	
}
