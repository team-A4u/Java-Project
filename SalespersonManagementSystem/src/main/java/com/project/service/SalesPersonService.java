package com.project.service;

import java.util.List;

import com.project.dto.SalesPerson;

public interface SalesPersonService
{
	public void addSalesPersonService(Integer salesPersonId, String password, String name, Integer pincode);
	public SalesPerson viewProfileService(Integer salesPersonId);
	public void updatePasswordService(Integer salesPersonId,String oldpassword, String newpassword);
	public void deleteUserService(Integer salesPersonId);
	public List<SalesPerson> listCustomersS();
}
