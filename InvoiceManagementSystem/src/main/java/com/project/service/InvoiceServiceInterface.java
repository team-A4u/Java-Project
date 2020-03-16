package com.project.service;

import com.project.dto.GeneratedInvoice;

public interface InvoiceServiceInterface {

	public void createInvoice(int orderId,int productId,String productName,int productPrice);
	public GeneratedInvoice getInvoice(int orderId);
	public void updateInvoiceAddProduct(int orderId,int productId,String productName,int productPrice);
	public void updateInvoiceDeleteProduct(int orderId,int productId);
	public void deleteInvoice(int orderId);
}
