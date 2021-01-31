package com.cg.onlinegrocery.dao;

import java.util.List;

import com.cg.onlinegrocery.domain.Account;
import com.cg.onlinegrocery.domain.Admin;
import com.cg.onlinegrocery.domain.Customer;
import com.cg.onlinegrocery.domain.StoreIncharge;

public interface AccountDAO {
	/**
	 * This save method will save the user object in users table
	 * @param user object to be saved
	 */
	void adminDetails(Admin admin);
	void customerDetails(Customer customer);
	void storeINchargeDetails(StoreIncharge storeIncharge);
	void logIn(Account account);

	/**
	 * This delete method will delete the user object from users table
	 * @param user to be deleted
	 */
	void delete(Account account);
	
	/**
	 * This update method will update the user in the users table 
	 * @param user to be updated
	 */
	void update(Account account);
	
	/**
	 * This findAll method will return the list of users if found 
	 * @return list of users if found otherwise null
	 */
	List<Account> findAlll();
	
	

	

}
