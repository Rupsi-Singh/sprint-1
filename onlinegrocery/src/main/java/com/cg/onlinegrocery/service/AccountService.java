package com.cg.onlinegrocery.service;

import java.util.List;

import com.cg.onlinegrocery.domain.Account;
import com.cg.onlinegrocery.domain.Admin;
import com.cg.onlinegrocery.exception.UserNotFoundException;

public interface AccountService {
	
	
	public static final int ROLE_ADMIN = 0;
    public static final int ROLE_CUSTOMER = 1;
    public static final int ROLE_STORE_IN_CHARGE =2;
	
	
	
	/**
	 * This registerUser Method will register the user in system
	 * @param user to be registered
	 */
	 void registerUser(Account acount);
	 /**
	  * This authenticateUser method will check the authenticity of the user
	  * @param email of the user
	  * @param pwd of the user
	  * @return user if authenticated successfully of UserNotFoundException in case there is no user in DB.
	  */
	 
	 
	 Account authenticateUser(String email,String password) throws UserNotFoundException;
	 void adminInfo(Admin admin);
	 
	 /**
	  * This showAllUsers method will return the list of users
	  * @return the list of users if found otherwise null.
	  */
	 List<Account> showAllUsers();


}
