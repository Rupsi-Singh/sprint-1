package com.cg.onlinegrocery.serviceimpl;

import java.util.List;

import com.cg.onlinegrocery.dao.AccountDAO;
import com.cg.onlinegrocery.domain.Account;
import com.cg.onlinegrocery.domain.Admin;
import com.cg.onlinegrocery.exception.UserNotFoundException;
import com.cg.onlinegrocery.objectfactory.ObjectFactory;
import com.cg.onlinegrocery.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	
	private AccountDAO accountDAO;

	public AccountServiceImpl() {
		accountDAO =  (AccountDAO)ObjectFactory.getBean("accountDAOImpl"); // Demanding Object
	}

	@Override
	public void registerUser(Account account) {
		account.setUserRole(ROLE_ADMIN);
		accountDAO.logIn(account);
		
	}

	@Override
	public Account authenticateUser(String email, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> showAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adminInfo(Admin admin) {
		accountDAO.adminDetails(admin);
		
	}

}
