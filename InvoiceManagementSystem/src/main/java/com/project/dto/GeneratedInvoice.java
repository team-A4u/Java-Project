package com.project.dto;

import java.util.HashMap;

public class GeneratedInvoice {

	int invoiceId;
	int orderId;
	String date;
	HashMap<String,Integer> products;
	int totalamount;
	boolean status;
	public GeneratedInvoice() {
		
	}
	public GeneratedInvoice(int invoiceId, int orderId, String date, HashMap<String, Integer> products, int totalamount,
			boolean status) {
		super();
		this.invoiceId = invoiceId;
		this.orderId = orderId;
		this.date = date;
		this.products = products;
		this.totalamount = totalamount;
		this.status = status;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public HashMap<String, Integer> getProducts() {
		return products;
	}
	public void setProducts(HashMap<String, Integer> products) {
		this.products = products;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "GeneratedInvoice [invoiceId=" + invoiceId + ", orderId=" + orderId + ", date=" + date + ", products="
				+ products + ", totalamount=" + totalamount + ", status=" + status + "]";
	}
	
}
