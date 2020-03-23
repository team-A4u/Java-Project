package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.dto.Product;


public class ProductMapper implements RowMapper<Product>
{
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Product objPojo = new Product();
		
		objPojo.setProductId(rs.getInt("productId"));
		objPojo.setProductCategory(rs.getString("productCategory"));
		objPojo.setProductName(rs.getString("productName"));
		objPojo.setProductPrice(rs.getFloat("productPrice"));
		
	    return objPojo;
		
	}
}
