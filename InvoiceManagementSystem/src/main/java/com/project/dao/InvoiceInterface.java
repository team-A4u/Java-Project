package com.project.dao;

import java.util.List;

import com.project.dto.Invoice;

public interface InvoiceInterface {

	public void createInvoice(int orderId,int productId,String productName,int productPrice,boolean status);
	public List<Invoice> getInvoice(int orderId);
	public void updateInvoiceAddProduct(int orderId,int productId,String productName,int productPrice,boolean status);
	public void updateInvoiceDeleteProduct(int orderID,int productId);
	public void deleteInvoice(int orderId);
	public void setupDB();
}
