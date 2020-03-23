package com.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.customerDAO.CustomerDAO;
import com.project.customerDTO.Customer;


@Service
public class CustomerServiceImpl  implements CustomerService 
{
	@Autowired
	private CustomerDAO custDao;

	@Override
	public void addUser(String userId, String password, String name, int pincode, int salesPersonId) 
	{
		// TODO Auto-generated method stub
		custDao.addUser(userId, password, name, pincode, salesPersonId);
	}

	@Override
	public Customer viewProfile(String userId) 
	{
		// TODO Auto-generated method stub
		return custDao.viewProfile(userId);
	}


	@Override
	public void deleteUser(String userId) 
	{
		// TODO Auto-generated method stub
		custDao.deleteUser(userId);
	}

	@Override
	public void updatePassword(String userId, String oldpassword,String newpassword) 
	{
		// TODO Auto-generated method stub
		custDao.updatePassword(userId,oldpassword, newpassword);
	}
	
		

}
