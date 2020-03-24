package com.project.order.dao;

import java.time.LocalDate;
import java.util.List;

import com.project.order.dto.Order;

public interface OrderInterface
{
	public void setupOrderDB();
	public List<Order> getAllOrder();
	public Order getOrderByOrderId(Integer orderId);
	public Order getOrderByCustomerId(Integer customerId);
	public Order getOrderByOrderDate(java.sql.Date orderDate);
//	public Product getAllProductByOrderId();
	public void	deleteOrderByOrderId(Integer orderId);
	public void deleteAllOrder();
//	public void deleteOrderByCustomerId(Integer customerId);
	public void updateOrderDateByOrderId(String orderDate, Integer orderId);
	public void insertOrder(Integer orderId, Integer customerId, LocalDate orderDate, Integer productId, String productName, Integer productPrice); 

	
}
