package com.project.dto;

public class Invoice {

	private int invoiceId;
	private int orderId;
	private int productId;
	private String productName;
	private int productPrice;
	//private int amount;
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

	private boolean status;
	public Invoice(int invoiceId, int orderId, int productId, String productName, int productPrice, /*int amount,*/
			boolean status) {
		super();
		this.invoiceId = invoiceId;
		this.orderId = orderId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		//this.amount = amount;
		this.status = status;
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
		return "Invoice [invoiceId=" + invoiceId + ", orderId=" + orderId + ", status=" + status
				+ "]";
	}
	
	
	
}
