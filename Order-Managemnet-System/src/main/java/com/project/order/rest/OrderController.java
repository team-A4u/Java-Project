
package com.project.order.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.order.dto.Order;
import com.project.order.service.OrderServiceInterface;

@RestController
@RequestMapping(value="/order")
public class OrderController 
{
	
	@Autowired
	OrderServiceInterface refOrderServiceInterface;

	@RequestMapping(value="/setupOrderDB", method=RequestMethod.POST)
	public void setupOrderDB()
	{
		refOrderServiceInterface.setupOrderDBService();
	}
	
	@RequestMapping(value="/getAllOrder",method=RequestMethod.GET)
	public List<Order> getAllOrder()
	{
		return refOrderServiceInterface.getAllOrderService();
	}
		
	 @RequestMapping(value="/getOrderByOrderId/{orderId}", method=RequestMethod.GET)
	 public Order getOrderByOrderId(@PathVariable("orderId")Integer orderId)
	  {
		  Order refOrder= refOrderServiceInterface.getOrderByOrderIdService(orderId);
		  return refOrder;
	  }
	 
	 
	 
	 //@PathVariable("orderDate")String orderDate)
	 @RequestMapping(value="/getOrderByOrderDate", method=RequestMethod.GET)
	 public Order getOrderByOrderDate(@RequestParam("orderDate")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) java.sql.Date orderDate)
	 {
		 Order refOrder= refOrderServiceInterface.getOrderByOrderDateService(orderDate);
		 return refOrder;
	 }
	 
	 
	 
	 @RequestMapping(value="/deleteOrderByOrderId}", method=RequestMethod.DELETE)
	 public void deleteOrderByOrderId(Integer orderId)
	 {
		 refOrderServiceInterface.deleteOrderByOrderIdService(orderId);
	 }
	 
	 @RequestMapping(value="/deleteAllOrder", method=RequestMethod.DELETE)
	 public void deleteAllOrder()
	 {
		 refOrderServiceInterface.deleteAllOrderService();
	 }
//to validate	 
	 @RequestMapping(value="/updateOrderByOrderId/{orderId}", method=RequestMethod.PUT)
		public void updateOrderDateByOrderId(@RequestParam String orderDate, @RequestParam Integer orderId)
		{
			refOrderServiceInterface.updateOrderDateByOrderIdService(orderDate, orderId);
		}
	 
	 @RequestMapping(value="/insertOrder", method=RequestMethod.POST)
	 public void insertOrder(@RequestParam Integer orderId,@RequestParam Integer customerId,
			 @RequestParam("orderDate")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate orderDate,
			 @RequestParam Integer productId, @RequestParam String productName, 
			 @RequestParam Integer productPrice )
//@DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate orderDate
	 {
		 refOrderServiceInterface.insertOrderService(orderId,customerId,orderDate,productId,productName,productPrice);
	 }
	
}
