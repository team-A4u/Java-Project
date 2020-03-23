package com.project.customerDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.customerDTO.Customer;


public class CustomerMapper implements RowMapper <Customer>
{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setUserId(rs.getString("userid"));
		customer.setPassword(rs.getString("password"));
		customer.setName(rs.getString("name"));
		customer.setPincode(rs.getInt("pincode"));
		customer.setSalesPersonId(rs.getInt("salespersonid"));
		return customer;
	}

}
