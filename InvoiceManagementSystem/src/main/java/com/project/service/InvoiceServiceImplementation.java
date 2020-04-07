package com.project.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.InvoiceInterface;
import com.project.dto.GeneratedInvoice;
import com.project.dto.Invoice;
import com.project.dto.ProductHelper;
@Service(value = "invoiceServiceImplementation")
public class InvoiceServiceImplementation implements InvoiceServiceInterface{

	@Autowired
	InvoiceInterface objInvoiceInterface;
	
	@Override
	public void updateInvoiceAddProduct(int orderId,int productId,String productName,int productPrice,Date orderDate) {
		
		objInvoiceInterface.updateInvoiceAddProduct(orderId, productId, productName, productPrice,false,orderDate);
	}

	@Override
	public void deleteInvoice(int orderId) {
		
		objInvoiceInterface.deleteInvoice(orderId);
	}
	

	@Override
	public void createInvoice(int orderId, int productId, String productName, int productPrice,Date orderDate) {
		
		objInvoiceInterface.createInvoice(orderId, productId, productName, productPrice, false,orderDate);
	}
	

	@Override
	public GeneratedInvoice getInvoice(int orderId) {
		List<Invoice> list= objInvoiceInterface.getInvoice(orderId);
		int invoiceId = list.get(0).getInvoiceId();
		Date orderDate = (Date) list.get(0).getOrderDate();
		int totalAmount = 0;
		List<ProductHelper> product = new ArrayList<ProductHelper>();
		for(Invoice obj : list)
		{
			int productId = obj.getProductId();
			String productName = obj.getProductName();
			int productPrice = obj.getProductPrice();
			totalAmount  += productPrice;
			product.add(new ProductHelper(productId,productName,productPrice));
		}
		 return  new GeneratedInvoice(invoiceId,orderId,orderDate,product,totalAmount,false);
		
	}

	@Override
	public void updateInvoiceDeleteProduct(int orderId, int productId) {
		objInvoiceInterface.updateInvoiceDeleteProduct(orderId, productId);
		
	}

}
