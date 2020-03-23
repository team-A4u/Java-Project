package com.example.rest;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.LoginService;



@RestController
public class UserAuthController 
{
	@Autowired
	private LoginService serviceobj;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	  public void test()
	  { 
		  System.out.println("TEST"); 
	  }
	
	 @RequestMapping(value="/check",method=RequestMethod.POST)
	  public String insert(@RequestParam String username, @RequestParam String password)
	  {
		 password=getMd5(password);
		 return serviceobj.checkUser(username,password); 
		  
	  }
	 public String getMd5(String input) 
	    { 
	  
	            try {
					// Static getInstance method is called with hashing MD5 
					MessageDigest md = MessageDigest.getInstance("MD5"); 
  
					// digest() method is called to calculate message digest 
					//  of an input digest() return array of byte 
					byte[] messageDigest = md.digest(input.getBytes()); 
  
					// Convert byte array into signum representation 
					BigInteger no = new BigInteger(1, messageDigest); 
  
					// Convert message digest into hex value 
					String hashtext = no.toString(16); 
					while (hashtext.length() < 32) 
					{ 
					    hashtext = "0" + hashtext; 
					} 
					return hashtext;
				} 
	            // For specifying wrong message digest algorithms 
	            catch (NoSuchAlgorithmException e) { 
	                throw new RuntimeException(e); 
	            } 
	        }  

}
