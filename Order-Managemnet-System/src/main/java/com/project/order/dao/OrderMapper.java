package com.project.order.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.project.order.dto.Order;

public class OrderMapper implements RowMapper<Order> {
	
	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		// To fetch rows of database in form of object
		
		Order objOrder = new Order();
		objOrder.setOrderId(rs.getInt("orderId"));
		LocalDate orderDate = rs.getObject("orderDate", LocalDate.class);
		objOrder.setOrderDate(orderDate);
		objOrder.setCustomerId(rs.getInt("customerId"));
		objOrder.setProductId(rs.getInt("productId"));
		objOrder.setProductName(rs.getString("productName"));
		objOrder.setProductPrice(rs.getInt("productPrice"));
		
		return objOrder;
	}

}
