package com.project.dto;

import java.sql.Date;
import java.util.List;

public class GeneratedInvoice {

	int invoiceId;
	int orderId;
	Date date;
	List<ProductHelper> products;
	int totalAmount;
	boolean status;
	public GeneratedInvoice() {
		
	}
	public GeneratedInvoice(int invoiceId, int orderId,Date date, List<ProductHelper> products, int totalAmount,
			boolean status) {
		super();
		this.invoiceId = invoiceId;
		this.orderId = orderId;
		this.date = date;
		this.products = products;
		this.totalAmount = totalAmount;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<ProductHelper> getProducts() {
		return products;
	}
	public void setProducts(List<ProductHelper> products) {
		this.products = products;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
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
				+ products + ", totalamount=" + totalAmount + ", status=" + status + "]";
	}
	
}
