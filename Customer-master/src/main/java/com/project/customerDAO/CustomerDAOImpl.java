/**
 * 
 */
package com.project.customerDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.customerDTO.Customer;

/**
 * @author pswalia
 *
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void addUser(String userId, String password, String name, int pincode, int salesPersonId) 
	{
		String SQL = "insert into customer (userid, password, name, pincode, salespersonid) values (?, ?, ?, ?, ?)";
		jdbcTemplateObject.update( SQL, userId, password, name, pincode, salesPersonId);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer viewProfile(String userId) 
	{
		// TODO Auto-generated method stub
		String SQL = "select * from customer where userid = ?";
		Customer customer = (Customer)jdbcTemplateObject.queryForObject(SQL,new Object[]{userId},new CustomerMapper());
		return customer;
	}

	@Override
	public void updatePassword(String userId,String oldpassword,String newpassword) 
	{
		// TODO Auto-generated method stub
		 String SQL = "update customer set password = ? where userid = ?";
		 String SQL1= "select password from customer where userid = ?";
		 String retOldPassword=jdbcTemplateObject.queryForObject(SQL1, new Object[]{userId}, String.class); 
		 if(retOldPassword.equals(oldpassword))
		 {
			 jdbcTemplateObject.update(SQL, newpassword, userId);
		 }
		 else
		 {
			 System.out.println("Wrong Password Entered!");
		 }
	}

	@Override
	public void deleteUser(String userId) 
	{
		 String SQL = "delete from customer where userid = ?";
	      jdbcTemplateObject.update(SQL, userId);
	}

}
