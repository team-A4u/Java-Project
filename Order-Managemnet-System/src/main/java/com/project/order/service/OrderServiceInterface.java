package com.project.order.service;


import java.time.LocalDate;
import java.util.List;

import com.project.order.dto.Order;

public interface OrderServiceInterface
{
	public void setupOrderDBService();
	public List<Order> getAllOrderService();
	public Order getOrderByOrderIdService(Integer orderId);
	public Order getOrderByCustomerIdService(Integer customerId);
	public Order getOrderByOrderDateService(java.sql.Date orderDate);
//	public Product getAllProductByOrderIdService();
	public void	deleteOrderByOrderIdService(Integer orderId);
	public void deleteAllOrderService();
//	public void deleteOrderByCustomerIdService(Integer customerId);
	public void updateOrderDateByOrderIdService(String orderDate, Integer orderId);
	public void insertOrderService(Integer orderId, Integer customerId, LocalDate orderDate, Integer productId, String productName, Integer productPrice); 

}
