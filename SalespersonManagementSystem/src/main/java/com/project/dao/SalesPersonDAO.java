package com.project.dao;

import java.util.List;

import com.project.dto.SalesPerson;

public interface SalesPersonDAO
{
	public void addSalesPerson(Integer salesPersonId, String password, String name, Integer pincode);
	public SalesPerson viewProfile(Integer salesPersonId);
	public void updatePassword(Integer salesPersonId,String oldpassword, String newpassword);
	public void deleteUser(Integer salesPersonId);
	public List<SalesPerson> listCustomers();
}
