package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.SalesPersonDAO;
import com.project.dto.SalesPerson;

@Service
public class SalesPersonServiceImpl implements SalesPersonService
{

	@Autowired
	private SalesPersonDAO objSalesPerson;
	
	@Override
	@Transactional
	public void addSalesPersonService(Integer salesPersonId, String password, String name, Integer pincode)
	{
		objSalesPerson.addSalesPerson(salesPersonId, password, name, pincode);
	}

	@Override
	public SalesPerson viewProfileService(Integer salesPersonId) 
	{
		return objSalesPerson.viewProfile(salesPersonId);
	}

	@Override
	@Transactional
	public void updatePasswordService(Integer salesPersonId, String oldpassword, String newpassword) {
		objSalesPerson.updatePassword(salesPersonId, oldpassword, newpassword);
	}

	@Override
	@Transactional
	public void deleteUserService(Integer salesPersonId) {
		objSalesPerson.deleteUser(salesPersonId);
	}

	@Override
	public List<SalesPerson> listCustomersS()
	{
		return objSalesPerson.listCustomers();
	}

}
