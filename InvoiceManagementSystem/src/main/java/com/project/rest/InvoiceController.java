package com.project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.GeneratedInvoice;
import com.project.service.InvoiceServiceInterface;

@RestController
@RequestMapping(value="/invoice")
public class InvoiceController {

	@Autowired
	private InvoiceServiceInterface objInvoiceService;
	
	
	@RequestMapping(value = "/getInvoice/{orderId}", method = RequestMethod.GET)
	public GeneratedInvoice getInvoice(@PathVariable("orderId") int orderId)
	{
		
		return objInvoiceService.getInvoice(orderId);
		
	}
	
	
	@RequestMapping(value = "/createInvoice",method = RequestMethod.POST)
	public void createInvoice(@RequestParam ("orderId") int orderId , @RequestParam("productId") int productId,@RequestParam("productName") String productName,
			@RequestParam("productPrice") int productPrice)
	{
		objInvoiceService.createInvoice(orderId,productId,productName,productPrice);
		
		
	}
	
	@RequestMapping(value = "/deleteInvoice/{orderId}",method = RequestMethod.DELETE)
	public void deleteInvoice(@PathVariable("orderId") int orderId)
	{
		objInvoiceService.deleteInvoice(orderId);
	}
	
	@RequestMapping(value = "/updateInvoiceAddProduct/{orderId}/addProduct",method = RequestMethod.PUT)
	public void updateInvoice(@PathVariable ("orderId")int orderId,@RequestParam("productId")int productId,@RequestParam ("productName")String productName,
			@RequestParam("productPrice")int productPrice)
	{
		objInvoiceService.updateInvoiceAddProduct(orderId,productId,productName,productPrice);
	}
	
	@RequestMapping(value="/updateInvoiceDeleteProduct/orderId/{orderId}/productId/{productId}",method = RequestMethod.PUT)
	public void updateInvoiceDeleteProduct(@PathVariable ("orderId")int orderId, @PathVariable("productId")int productId)
	{
		objInvoiceService.updateInvoiceDeleteProduct(orderId, productId);
	}
}
