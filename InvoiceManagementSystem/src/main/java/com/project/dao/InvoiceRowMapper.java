package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.dto.Invoice;

public class InvoiceRowMapper implements RowMapper<Invoice> {

	@Override
	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invoice obj = new Invoice();
		obj.setInvoiceId(rs.getInt("invoiceId"));
		obj.setOrderId(rs.getInt("orderId"));
		obj.setProductId(rs.getInt("productId"));
		obj.setProductName(rs.getString("productName"));
		obj.setProductPrice(rs.getInt("productPrice"));
		//obj.setAmount(rs.getInt("amount"));
		obj.setStatus(rs.getBoolean("status"));
		obj.setOrderDate(rs.getDate("orderDate"));
		return obj;
	}

	
}
