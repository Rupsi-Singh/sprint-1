package com.cg.onlinegroceryordering.util;

import java.util.Scanner;

import com.cg.onlinegroceryordering.domain.Login;
import com.cg.onlinegroceryordering.domain.UserDetail;
import com.cg.onlinegroceryordering.service.LoginService;
import com.cg.onlinegroceryordering.serviceimpl.LoginServiceImpl;

public class MenuUtil {
	private LoginService loginservice;
	
	public MenuUtil() {
		loginservice = new LoginServiceImpl();
	}
	public void start()
	{
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	Login login = new Login();
	UserDetail user = new UserDetail();
	
	int choice;
	String continueChoice;

	do {
		showMenu();
		System.out.println("Enter Your Choice");
		choice = sc.nextInt();
		switch (choice) 
		{
		case 1:
			
			
			System.out.println("Enter name : ");
			user.setName(sc.next());
			System.out.println("Enter phone : ");
			user.setPhone(sc.next());
			System.out.println("Enter email: ");
			user.setEmail(sc.next());
			System.out.println("Enter address");
			user.setAddress(sc.next());
			System.out.println("Enter User id :");
			user.setUserId(sc1.nextInt());
			System.out.println("Username: ");
			user.setuserName(sc.next());
			System.out.println("Password : ");
			user.setPassword(sc.next());
			System.out.println("Role :");
			//login.setRole(login.getRole());
			
			//login.setRole(login.getRole());
			user.setRole(sc.next());
			loginservice.validatePassword(user);
			if(loginservice.validatePassword(user))
			{
				loginservice.details(user);
			System.out.println("Registration Successful!!");}
			else
				System.out.println("Registration failed!!");
           
			System.out.println("--------------------details saved---------------");
		break;

		case 2:
			UserDetail user1=new UserDetail();
		    System.out.println("Enter your username: ");			
		    user1.setuserName(sc.next());
		    System.out.println("Enter your password : ");
			user1.setPassword(sc.next());
			loginservice.validateUser(user1);
			if(loginservice.validateUser(user1))
			{
				System.out.println("Login successfull!!");
			}
			else
			{
				System.out.println("Invalid user!!");
			}
			
				
			
			
			//loginservice.registerUser(user1);
			//login.setRole(login.getRole());
			
			//login.setRole(login.getRole());
			//login.setRole(sc.next());
			//loginservice.validatePassword(login);
			//if(loginservice.validatePassword(login))
			//{
			      //loginservice.registerUser(login);
			//System.out.println("Registration Successful!!");}
			//else
				//System.out.println("Registration failed!!");
			break;
			default:
				System.out.println("Wrong choice");
		
		}
			System.out.println("Do you want to continue : [yes/no]");
			continueChoice = sc.next();
			
	}
		while (continueChoice.equalsIgnoreCase("yes"));
		sc.close();
		sc1.close();}
	
	public void showMenu() {
		System.out.println("-------------GROCERY SHOPPING-------");
		System.out.println("1.REGISTRATION");
		System.out.println("2.LOGIN");
		//System.out.println("3.");
		//System.out.println("4.");
		//System.out.println("5.");
		//System.out.println("0.EXIT");
		//System.out.println();

	}

}
		
	
	
	
