package com.project.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dto.Product;

@Repository
public class ProductImplementation implements ProductInterface
{	
	@Autowired
	private JdbcTemplate objJdbcTemp;
	
	@Override
	public void createTable()
	{
		objJdbcTemp.execute("DROP TABLE IF EXISTS product");
		objJdbcTemp.execute("CREATE TABLE product (productId INT PRIMARY KEY, productCategory VARCHAR(255), productName VARCHAR(255), productPrice FLOAT");
	}

	@Override
	@Transactional
	public void add(Integer productId, String productCategory, String productName, Float productPrice)
	{
		String sql="INSERT INTO product VALUES(?,?,?,?)";
		objJdbcTemp.update(sql, productId, productCategory, productName, productPrice);
	}

	@Override
	@Transactional
	public void updateNameWhereId(String productName, Integer productId)
	{
		String sql="UPDATE product SET productName=? WHERE productId=?";
		objJdbcTemp.update(sql, productName, productId);
		
	}
	
	@Override
	@Transactional
	public void updateCategoryWhereId(String productCategory, Integer productId)
	{
		String sql="UPDATE product SET productCategory=? WHERE productId=?";
		objJdbcTemp.update(sql, productCategory, productId);
		
	}
	
	@Override
	@Transactional
	public void updatePriceWhereId(Float productPrice, Integer productId)
	{
		String sql="UPDATE product SET productPrice=? WHERE productId=?";
		objJdbcTemp.update(sql, productPrice, productId);
		
	}

	@Override
	@Transactional
	public void deleteWhereId(Integer productId)
	{
		String sql="DELETE FROM product WHERE productId=?";
		objJdbcTemp.update(sql, productId);
	}

	@Override
	public List<Product> listProducts()
	{
		String sql="SELECT * FROM product";
		return objJdbcTemp.query(sql, new ProductMapper());
	}

	@Override
	public Product getProductWhereID(Integer productId)
	{
		String sql="SELECT * FROM product WHERE productId=?";
		return objJdbcTemp.queryForObject(sql, new Object[] {productId}, new ProductMapper());
	}

	@Override
	public List<Product> getProductsByCategory(String productCategory)
	{
		String sql="SELECT * FROM product WHERE productCategory=?";
		return objJdbcTemp.query(sql, new Object[] {productCategory}, new ProductMapper());
	}
	
	
	
	
	
}
