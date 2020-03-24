package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.SalesPerson;
import com.project.service.SalesPersonService;

@RestController
@RequestMapping(value="/salesperson")
public class SalesPersonController
{
	@Autowired
	private SalesPersonService salesservice;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	  public String test()
	  { 
		  //System.out.println("TEST"); 
		  return "TEST!!!!";
	  }
	  
	@RequestMapping(value="/fetchall", method=RequestMethod.GET)
	public List<SalesPerson> customersList()
	{
		return salesservice.listCustomersS();
	}
	
	
	@RequestMapping(value="/delete/{salespersonid}", method=RequestMethod.DELETE)
	  public void deleteService(@PathVariable("salespersonid") Integer salespersonid) 
	  { 
		 System.out.println("in delete");
		 salesservice.deleteUserService(salespersonid);
	  }  
	
	 @RequestMapping(value="/create",method=RequestMethod.POST)
	  public void insert(@RequestParam Integer salespersonid,@RequestParam String password,@RequestParam String name, @RequestParam Integer pincode)
	  {
		 salesservice.addSalesPersonService(salespersonid, password, name, pincode);
	  }
	 
	@RequestMapping(value = "/profile/{salespersonid}",method = RequestMethod.GET)
	 public SalesPerson getCustomer(@PathVariable ("salespersonid") Integer salespersonid)
	 {
		System.out.println("in get by id");
		return salesservice.viewProfileService(salespersonid);
	 }
	
	
	 @RequestMapping(value="/update/password/",method=RequestMethod.POST)
	 public void update(@RequestParam Integer salespersonid, @RequestParam String oldpassword, @RequestParam String newpassword)
	 
	 {
			 salesservice.updatePasswordService(salespersonid,oldpassword,newpassword);
	 }
}
