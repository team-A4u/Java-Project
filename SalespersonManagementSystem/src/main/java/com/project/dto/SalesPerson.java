package com.project.dto;

public class SalesPerson
{
	Integer salesPersonId;
	String password;
	String name;
	Integer pincode;
	
	public SalesPerson() {
		// TODO Auto-generated constructor stub
	}
	
	public SalesPerson(Integer salesPersonId, String password, String name, Integer pincode) {
		super();
		this.salesPersonId = salesPersonId;
		this.password = password;
		this.name = name;
		this.pincode = pincode;
	}

	public int getSalesPersonId() {
		return salesPersonId;
	}

	public void setSalesPersonId(Integer salesPersonId) {
		this.salesPersonId = salesPersonId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
}
