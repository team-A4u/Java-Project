/**
 * 
 */
package com.project.customerDAO;

import com.project.customerDTO.Customer;

/**
 * @author pswalia
 *
 */
public interface CustomerDAO 
{
	public void addUser(String userId, String password, String name, int pincode, int salesPersonId);
	public Customer viewProfile(String userId);
	public void updatePassword(String userId,String oldpassword, String newpassword);
	public void deleteUser(String userId);
}
