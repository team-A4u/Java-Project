package com.project.dao;

import java.util.List;

import com.project.dto.Product;

public interface ProductInterface
{
	public void createTable();
	public void add(Integer productId, String productCategory, String productName, Float productPrice);
	public void updateNameWhereId(String productName, Integer productID);
	public void updateCategoryWhereId(String productCategory, Integer productID);
	public void updatePriceWhereId(Float productPrice, Integer productID);
	public void deleteWhereId(Integer productId);
	public List<Product> listProducts();
	public Product getProductWhereID(Integer productId);
	public List<Product> getProductsByCategory(String productCategory);
}
