package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.dto.SalesPerson;

public class SalesPersonMapper implements RowMapper<SalesPerson> {

	@Override
	public SalesPerson mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		SalesPerson salesperson = new SalesPerson();
		salesperson.setSalesPersonId(rs.getInt("salespersonid"));
		salesperson.setPassword(rs.getString("password"));
		salesperson.setName(rs.getString("name"));
		salesperson.setPincode(rs.getInt("pincode"));
		return salesperson;
	}

}
