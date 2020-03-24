package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dto.SalesPerson;

@Repository
public class SalesPersonDAOImpl implements SalesPersonDAO
{

	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	@Transactional
	public void addSalesPerson(Integer salesPersonId, String password, String name, Integer pincode)
	{
		String SQL = "insert into salesperson (salespersonid, password, name, pincode) values (?, ?, ?, ?, ?)";
		jdbcTemplateObject.update( SQL, salesPersonId, password, name, pincode);
	}

	@Override
	public SalesPerson viewProfile(Integer salesPersonId) 
	{
		String SQL = "select * from salesperson where salespersonid = ?";
		SalesPerson salesperson = jdbcTemplateObject.queryForObject(SQL,new Object[]{salesPersonId},new SalesPersonMapper());
		return salesperson;
	}

	@Override
	@Transactional
	public void updatePassword(Integer salesPersonId, String oldpassword, String newpassword) 
	{
		String SQL = "update salesperson set password=? where salespersonid=?";
		String SQL1 = "select password from salesperson where salespersonid=?";
		String getPass = jdbcTemplateObject.queryForObject(SQL1, new Object[]{salesPersonId}, String.class);
		if(getPass.equals(oldpassword))
		{	
			jdbcTemplateObject.update( SQL, newpassword, salesPersonId);
		}
		else
		{
			System.out.println("WRONG PASSWORD ENTERED!!!!!!!");
		}
	}

	@Override
	@Transactional
	public void deleteUser(Integer salesPersonId)
	{
		String SQL = "delete from salesperson where salespersonid=?";
		jdbcTemplateObject.update(SQL, salesPersonId);
	}

	@Override
	public List<SalesPerson> listCustomers()
	{
		String SQLQuery = "SELECT * FROM CUSTOMER";
		return jdbcTemplateObject.query(SQLQuery, new SalesPersonMapper());
	}

}
