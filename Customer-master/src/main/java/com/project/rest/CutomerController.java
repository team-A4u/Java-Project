package com.project.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.customerDTO.Customer;
import com.project.service.CustomerService;



@RestController
public class CutomerController 
{
	@Autowired
	private CustomerService custservice;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	  public void test()
	  { 
		  System.out.println("TEST"); 
	  }
	  
	@RequestMapping(value="/customer/delete/{uderid}", method=RequestMethod.DELETE)
	  public void deleteService(@PathVariable("userid") String userid) 
	  { 
		 System.out.println("in delete");
		 custservice.deleteUser(userid);
	  }  
	
	 @RequestMapping(value="customer/create",method=RequestMethod.POST)
	  public void insert(@RequestParam String userid,@RequestParam String password,@RequestParam String name, @RequestParam Integer pincode,@RequestParam Integer salespersonid)
	  {
		 custservice.addUser(userid, password, name, pincode, salespersonid);
	  }
	 
	@RequestMapping(value = "customer/profile/{userid}",method = RequestMethod.GET)
	 public Customer getCustomer(@PathVariable ("userid") String userid)
	 {
		System.out.println("in get by id");
		return custservice.viewProfile(userid);
	 }
	
	
	 @RequestMapping(value="customer/update/password/",method=RequestMethod.POST)
	 public void update(@RequestParam String userid, @RequestParam String oldpassword, @RequestParam String newpassword)
	 
	 {
			 custservice.updatePassword(userid,oldpassword,newpassword);
	 }
	
}
