package com.project.service;

import java.sql.Date;

import com.project.dto.GeneratedInvoice;

public interface InvoiceServiceInterface {

	public void createInvoice(int orderId,int productId,String productName,int productPrice,Date orderDate);
	public GeneratedInvoice getInvoice(int orderId);
	public void updateInvoiceAddProduct(int orderId,int productId,String productName,int productPrice,Date orderDate);
	public void updateInvoiceDeleteProduct(int orderId,int productId);
	public void deleteInvoice(int orderId);
}
