package com.project.order.service;


import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.order.dao.OrderInterface;
import com.project.order.dto.Order;

@Service
public class OrderServiceImplementation implements OrderServiceInterface {

	@Autowired
	private OrderInterface refOrderInterface;
	
	@Override
	public void setupOrderDBService()
	{
		refOrderInterface.setupOrderDB();
	}
	
	@Override
	public List<Order> getAllOrderService() {
		
		List<Order> refListOrder=refOrderInterface.getAllOrder();
		return refListOrder;
	}

	@Override
	public Order getOrderByOrderIdService(Integer orderId) {
		
		
		Order refOrder= refOrderInterface.getOrderByOrderId(orderId);
		return refOrder;
	}
	
	@Override
	public Order getOrderByCustomerIdService(Integer customerId) {
		
		
		Order refOrder= refOrderInterface.getOrderByOrderId(customerId);
		return refOrder;
	}

	@Override
	public Order getOrderByOrderDateService(java.sql.Date orderDate) {
		
		Order refOrder=refOrderInterface.getOrderByOrderDate(orderDate);
		return refOrder;
	}

	@Override
	public void deleteOrderByOrderIdService(Integer orderId) {
		
		refOrderInterface.deleteOrderByOrderId(orderId);
	}

	@Override
	public void deleteAllOrderService() {
		
		refOrderInterface.deleteAllOrder();
	}

	@Override
	public void updateOrderDateByOrderIdService(String orderDate, Integer orderId) {
		
		refOrderInterface.updateOrderDateByOrderId(orderDate, orderId);
	}

	@Override
	public void insertOrderService(Integer orderId, Integer customerId, LocalDate orderDate, Integer productId, String productName, Integer productPrice) 
	{
		refOrderInterface.insertOrder(orderId,customerId,orderDate,productId,productName,productPrice);

	}

}
