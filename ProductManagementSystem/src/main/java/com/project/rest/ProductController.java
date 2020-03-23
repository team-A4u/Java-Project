package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.Product;
import com.project.service.ProductInterfaceService;

@RestController
@RequestMapping(value="/products")
public class ProductController
{
	@Autowired
	ProductInterfaceService addressProductInterfaceService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void add(@RequestParam Integer productId, @RequestParam String productCategory, @RequestParam String productName, @RequestParam Float productPrice)
	{
		addressProductInterfaceService.add(productId, productCategory, productName, productPrice);
	}
	
	
	@RequestMapping(value="/id/{productId}", method=RequestMethod.GET)
	public Product getProductWhereID(@PathVariable("productId") Integer productId)
	{
		return addressProductInterfaceService.getProductWhereID(productId);
	}
	
	@RequestMapping(value="/details", method=RequestMethod.GET)
	public List<Product> listProducts()
	{
		return addressProductInterfaceService.listProducts();
	}
	
	@RequestMapping(value="/category/{productCategory}", method=RequestMethod.GET)
	public List<Product> getProductsByCategory(@PathVariable("productCategory") String productCategory)
	{
		return addressProductInterfaceService.getProductsByCategory(productCategory);
	}
}
