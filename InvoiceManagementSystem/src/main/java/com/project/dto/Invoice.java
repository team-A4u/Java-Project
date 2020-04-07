package com.project.dto;

import java.util.Date;

public class Invoice {

	private int invoiceId;
	private Date orderDate;


	private int orderId;
	private int productId;
	private String productName;
	private int productPrice;
	private boolean status;
	
	
	





	public Invoice(int invoiceId, Date orderDate, int orderId, int productId, String productName, int productPrice,
			boolean status) {
		super();
		this.invoiceId = invoiceId;
		this.orderDate = orderDate;
		this.orderId = orderId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.status = status;
	}




	//private int amount;
	
	
	public Date getOrderDate() {
		return orderDate;
	}




	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getProductId() {
		return productId;
	}




	public void setProductId(int productId) {
		this.productId = productId;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public int getProductPrice() {
		return productPrice;
	}




	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	

	
	
	
	public Invoice()
	{
		
	}

	

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/*
	 * public int getAmount() { return amount; }
	 * 
	 * public void setAmount(int amount) { this.amount = amount; }
	 */

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", orderDate=" + orderDate + ", orderId=" + orderId + ", productId="
				+ productId + ", productName=" + productName + ", productPrice=" + productPrice + ", status=" + status
				+ "]";
	}
	
}
