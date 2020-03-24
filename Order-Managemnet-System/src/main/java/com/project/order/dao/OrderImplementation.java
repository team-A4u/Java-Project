package com.project.order.dao;


import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.order.dto.Order;

@Repository
public class OrderImplementation implements OrderInterface {

	Logger logger=LoggerFactory.getLogger(OrderImplementation.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	
	@Override
	public void setupOrderDB() {
		
		
//		jdbcTemplateObject.execute("DROP table IF EXISTS order");
//		logger.debug("Entering setub DB");
		jdbcTemplateObject.execute("CREATE TABLE OMS ("
				+ "orderId INT PRIMARY KEY AUTO_INCREMENT,"
				+ " customerId INT NOT NULL,"
				+ " orderDate DATE NOT NULL,"
				+ " productId INT NOT NULL, "
				+ "productName VARCHAR(30) NOT NULL,"
				+ "productPrice INT NOT NULL)");
//		logger.debug("Finish setub DB");
		
		
		
	}
	
	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		String sql="select * from OMS";
		List<Order> refListOrder=jdbcTemplateObject.query(sql, new OrderMapper());
		return refListOrder;
	}

	@Override
	public Order getOrderByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		String sql="select * from OMS where orderId=?";
		Order objOrder=jdbcTemplateObject.queryForObject(sql, new Object[] {orderId}, new OrderMapper());
		return objOrder;
	}

	@Override
	public Order getOrderByCustomerId(Integer customerId) {
		// TODO Auto-generated method stub
		String sql="select * from OMS where customerId=?";
		Order objOrder=jdbcTemplateObject.queryForObject(sql, new Object[] {customerId}, new OrderMapper());
		return objOrder;
	}

	@Override
	public Order getOrderByOrderDate(java.sql.Date orderDate) 
	{
		
//		 Month month=orderDate.getMonth();
//		 int year=orderDate.getYear();
//		 int dayOfMonth=orderDate.getDayOfMonth();
		 
//		java.sql.Date date = java.sql.Date.valueOf(LocalDate.of(year, month, dayOfMonth));
		String sql="select * from OMS where orderDate=?";
		Order objOrder=jdbcTemplateObject.queryForObject(sql, new Object[] {orderDate}, new OrderMapper());
		return objOrder;
	}
	
//	@Override
//	public Product getAllProductByOrderId()
//	{
//	}

	@Transactional
	@Override
	public void deleteOrderByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		String sql="DELETE from OMS where orderId=?";
		jdbcTemplateObject.update(sql, orderId);

	}
	@Transactional
	@Override
	public void deleteAllOrder() {
		// TODO Auto-generated method stub
		String sql="DELETE from OMS";
		jdbcTemplateObject.update(sql);

	}

//	@Override
//	public void deleteOrderByCustomerId() {
//		// TODO Auto-generated method stub
//
//	}

	@Transactional
	@Override
	public void updateOrderDateByOrderId(String orderDate, Integer orderId) {
		// TODO Auto-generated method stub
		String sql = "update OMS set orderDate = ? where orderId = ?";
	      jdbcTemplateObject.update(sql, orderDate, orderId);
	}
@Transactional
	@Override
	public void insertOrder(Integer orderId, Integer customerId, LocalDate orderDate, Integer productId, String productName, Integer productPrice) 
	{
		String sql="insert into OMS (orderId,customerId,orderDate,productId,productName,productPrice) values(?,?,?,?,?,?)";
		jdbcTemplateObject.update(sql, orderId,customerId,orderDate,productId,productName,productPrice);
	}

}
