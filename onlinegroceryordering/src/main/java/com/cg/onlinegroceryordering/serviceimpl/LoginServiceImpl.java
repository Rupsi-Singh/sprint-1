package com.cg.onlinegroceryordering.serviceimpl;


import java.util.regex.*;

import javax.persistence.EntityManager;


import com.cg.onlinegroceryordering.DAO.LoginDAO;
import com.cg.onlinegroceryordering.DAOImpl.LoginDAOImpl;
import com.cg.onlinegroceryordering.domain.UserDetail;
import com.cg.onlinegroceryordering.service.LoginService;
import com.cg.onlinegroceryordering.util.DBUtils;

public class LoginServiceImpl extends DBUtils implements LoginService{
	
	private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
	private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
	
	
	private LoginDAO logindao;
	DBUtils dbutil;
	EntityManager em;
	

	public LoginServiceImpl() {
		logindao =new LoginDAOImpl();
		
			dbutil=new DBUtils();
		}
	
	
	

	@Override
	public void registerUser(UserDetail user1) {
		logindao.logIn(user1);
	}
	

	@Override
	public boolean validatePassword(UserDetail user) {
		String pwd=user.getPassword();
		if(pwd.matches(PASSWORD_PATTERN))
			return true;
		else 
			return false;
			
	    }

	@Override
	public void details(UserDetail user) {
		logindao.saveDetails(user);
		
	}
	@Override
	public boolean validateUser(UserDetail user1) {
		em=dbutil.getEntityManager();
		em.getTransaction().begin();
		UserDetail obj=em.find(UserDetail.class,user1.getuserName());
		if(obj==null)
			return false;
		else
			return true;
				
	}

	
		
	}
	
	
	


