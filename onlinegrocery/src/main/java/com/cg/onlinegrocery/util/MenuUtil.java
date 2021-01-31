package com.cg.onlinegrocery.util;

import java.util.Scanner;

import com.cg.onlinegrocery.daoimpl.AccountDAOImpl;
import com.cg.onlinegrocery.domain.Account;
import com.cg.onlinegrocery.domain.Admin;
import com.cg.onlinegrocery.objectfactory.ObjectFactory;
import com.cg.onlinegrocery.service.AccountService;

public class MenuUtil {
private AccountService accountService;
//private AccountDAOImpl accountdaoimpl;
Scanner sc=new Scanner(System.in);
	
	
	public MenuUtil() {
		accountService = (AccountService) ObjectFactory.getBean("accountServiceImpl");
		}
	public void start()
	{
		
		System.out.println("----Enter details-------");
		Account account = new Account();
		System.out.println("Enter username : ");
		account.setUserName(sc.next());
		
	    System.out.println("Enter your Password : ");
		account.setPassword(sc.next());
		accountService.registerUser(account);
		System.out.println("Success! You are Registered.");
		
		
		//System.out.println("------Admin details------");
		//Admin admin=new Admin();
		//System.out.println("Phone no : ");
		//admin.setAdminPhone(sc.next());
		//System.out.println("Email:  ");
		//admin.setAdminEmail(sc.next());
		//accountdaoimpl.adminDetails(admin);
		//System.out.println("----------------------------");
		

}


}
