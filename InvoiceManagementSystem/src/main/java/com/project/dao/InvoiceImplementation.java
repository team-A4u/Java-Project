package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dto.Invoice;
@Repository
public class InvoiceImplementation implements InvoiceInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	@Transactional
	public void setupDB()
	{
		jdbcTemplate.execute("DROP table IF EXISTS invoice;");
		jdbcTemplate.execute("CREATE table invoice (invoiceId SERIAL ,orderId INT,productId INT, productName INT,productPriceINT, status BOOLEAN )");
	}
	@Transactional
	@Override
	public void createInvoice(int orderId, int productId, String productName, int productPrice,
			boolean status) {
		String sql = "insert into invoice (orderId,productId,productName,productPrice,status) values (?,?,?,?,?)";
		jdbcTemplate.update(sql,orderId,productId,productName,productPrice,status);
		
	}
	
	@Transactional
	private void createInvoice(int invoiceId, int orderId, int productId, String productName, int productPrice,
			 boolean status) {
		String sql = "insert into invoice (invoiceId,orderId,productId,productName,productPrice,status) values (?,?,?,?,?,?)";
		jdbcTemplate.update(sql,invoiceId,orderId,productId,productName,productPrice,status);
		
		
	}

	@Override
	public List<Invoice> getInvoice(int orderId) {
		
		String sql = "select * from invoice where orderId = ?";
		List<Invoice> obj = jdbcTemplate.query(sql,new  Object[] {orderId}, new InvoiceRowMapper());
		return obj;
	}
	@Transactional
	@Override
	public void updateInvoiceAddProduct(int orderId,int productId,String productName,int productPrice, boolean status) {
		//String sql1 = "select invoiceId from invoice where orderId = ? limit 1";
		//int invoiceId =  jdbcTemplate.queryForObject(sql1, new Object[]{orderId}, Integer.class);
		createInvoice(orderId,productId,productName,productPrice,false);
	
		
	}
	
	@Transactional
	@Override
	public void deleteInvoice(int orderId) {
		String sql = "delete from invoice where orderId = ?";
		jdbcTemplate.update(sql, orderId);
		
	}
	@Override
	public void updateInvoiceDeleteProduct(int orderId, int productId) {

		String sql = "delete from invoice where orderId = ? and productId = ?";
		jdbcTemplate.update(sql, orderId,productId);
		
	}
	

}
