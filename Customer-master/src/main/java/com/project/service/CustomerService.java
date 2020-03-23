package com.project.service;

import com.project.customerDTO.Customer;


public interface CustomerService 
{
	public void addUser(String userId, String password, String name, int pincode, int salesPersonId);
	public Customer viewProfile(String userId);
	public void deleteUser(String userId);
	public void updatePassword(String userId,String oldpassword,String newpassword);

}
