package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ProductInterface;
import com.project.dto.Product;

@Service
public class ProductImplementationService implements ProductInterfaceService
{
	@Autowired
	ProductInterface addressProductInterface;

	@Override
	public void createTable()
	{
		addressProductInterface.createTable();
		
	}

	@Override
	public void add(Integer productId, String productCategory, String productName, Float productPrice) {
		addressProductInterface.add(productId, productCategory, productName, productPrice);
		
	}

	@Override
	public void updateNameWhereId(String productName, Integer productID) {
		addressProductInterface.updateNameWhereId(productName, productID);
		
	}

	@Override
	public void updateCategoryWhereId(String productCategory, Integer productID) {
		addressProductInterface.updateCategoryWhereId(productCategory, productID);
		
	}

	@Override
	public void updatePriceWhereId(Float productPrice, Integer productID) {
		addressProductInterface.updatePriceWhereId(productPrice, productID);
		
	}

	@Override
	public void deleteWhereId(Integer productId) {
		addressProductInterface.deleteWhereId(productId);
		
	}

	@Override
	public List<Product> listProducts()
	{
		return addressProductInterface.listProducts();
	}

	@Override
	public Product getProductWhereID(Integer productId)
	{
		return addressProductInterface.getProductWhereID(productId);
	}

	@Override
	public List<Product> getProductsByCategory(String productCategory)
	{
		return addressProductInterface.getProductsByCategory(productCategory);
	}
	

}
