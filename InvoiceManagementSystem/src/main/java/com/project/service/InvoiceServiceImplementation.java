package com.project.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.InvoiceInterface;
import com.project.dto.GeneratedInvoice;
import com.project.dto.Invoice;
@Service(value = "invoiceServiceImplementation")
public class InvoiceServiceImplementation implements InvoiceServiceInterface{

	@Autowired
	InvoiceInterface objInvoiceInterface;
	
	@Override
	public void updateInvoiceAddProduct(int orderId,int productId,String productName,int productPrice) {
		
		objInvoiceInterface.updateInvoiceAddProduct(orderId, productId, productName, productPrice,false);
	}

	@Override
	public void deleteInvoice(int orderId) {
		
		objInvoiceInterface.deleteInvoice(orderId);
	}
	

	@Override
	public void createInvoice(int orderId, int productId, String productName, int productPrice) {
		
		objInvoiceInterface.createInvoice(orderId, productId, productName, productPrice, false);
	}
	

	@Override
	public GeneratedInvoice getInvoice(int orderId) {
		List<Invoice> list= objInvoiceInterface.getInvoice(orderId);
		int invoiceId =	list.get(0).getInvoiceId();
		HashMap<String,Integer> productList = new HashMap<>();
		//int invoiceId = 0;
		int totalAmount = 0;
		for(Invoice obj : list)
		{
			//invoiceId = obj.getInvoiceId();
			String prod = obj.getProductName();
			int price = obj.getProductPrice();
			totalAmount += price;
			if(productList.containsKey(prod))
			{
				int oldPrice = productList.get(prod); 
				productList.replace(prod,oldPrice+price );
			}
			else
				productList.put(prod, price);
		}
		GeneratedInvoice objGeneratedInvoice = new GeneratedInvoice();
		objGeneratedInvoice.setInvoiceId(invoiceId);
		objGeneratedInvoice.setOrderId(orderId);
		objGeneratedInvoice.setProducts(productList);
		objGeneratedInvoice.setTotalamount(totalAmount);
		objGeneratedInvoice.setDate(null);
		objGeneratedInvoice.setStatus(false);
		return objGeneratedInvoice;
		
	}

	@Override
	public void updateInvoiceDeleteProduct(int orderId, int productId) {
		objInvoiceInterface.updateInvoiceDeleteProduct(orderId, productId);
		
	}

}
