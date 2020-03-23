/**
 * 
 */
package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.userDAO;



/**
 * @author pswalia
 *
 */
@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired 
	userDAO userDAOobj;

	@Override
	public String checkUser(String username,String password) 
	{
		String output=userDAOobj.checkUser(username,password);
		return output;
	}
	

}
