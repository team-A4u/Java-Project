/**
 * 
 */
package com.example.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



/**
 * @author pswalia
 *
 */
@Repository
public class userDAOImpl implements userDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	

	@Override
	public String checkUser(String username, String password) 
	{
		// TODO Auto-generated method stub
		System.out.println("Username enetered: "+username);
		System.out.println("Password enetered: "+password);
		String SQL= "select username from users where username = ?";
		
		System.out.println("Afetr SQL query: ");
		
		try {
			String retUsername=jdbcTemplateObject.queryForObject(SQL, new Object[]{username}, String.class);
			//System.out.println(retUsername);
			
			if(retUsername.equals(username))
			{
				int check_pass_output=checkPassword(username,password);
				if(check_pass_output==1)
				{
					return "Successfully loggedIn";
				}
				else
				{
					return "Wrong password";
				}
			}
			else
			{
				return "Username Not Found";
			}
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			return "Username Not Found";
		}
		
	}
	public int checkPassword(String username, String password)
	{
		System.out.println("In password Checking");
		String SQL1= "select password from users where username = ?";
		String retPassword=jdbcTemplateObject.queryForObject(SQL1, new Object[]{username}, String.class);
		System.out.println("Returned Password:"+retPassword);
		if(retPassword.equals(password)) 
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	
	

}
