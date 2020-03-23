/**
 * 
 */
package com.project.customerDTO;

/**
 * @author pswalia
 *
 */
public class Customer 
{
	String userId;
	String password;
	String name;
	int pincode;
	int salesPersonId;
	public Customer()
	{
		// TODO Auto-generated constructor stub
	}
	public String getUserId() 
	{
		return userId;
	}
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getPincode() 
	{
		return pincode;
	}
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	public int getSalesPersonId() 
	{
		return salesPersonId;
	}
	public void setSalesPersonId(int salesPersonId) 
	{
		this.salesPersonId = salesPersonId;
	}

}
