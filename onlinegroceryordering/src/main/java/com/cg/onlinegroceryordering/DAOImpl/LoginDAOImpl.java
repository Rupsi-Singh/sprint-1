package com.cg.onlinegroceryordering.DAOImpl;

import javax.persistence.EntityManager;

import com.cg.onlinegroceryordering.DAO.LoginDAO;
import com.cg.onlinegroceryordering.domain.Login;
import com.cg.onlinegroceryordering.domain.UserDetail;
import com.cg.onlinegroceryordering.util.DBUtils;

public class LoginDAOImpl extends DBUtils implements LoginDAO {
	
	DBUtils dbutil;
	EntityManager em;
	public LoginDAOImpl() {
		dbutil=new DBUtils();
	}

	@Override
	public void validateUser(Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logIn(Login login) {
		/*
		 * login.setuserName("rupsi"); login.setPassword("abc@1234");
		 * login.setRole("Customer");
		 */
		
		em=dbutil.getEntityManager();
		em.getTransaction().begin();
		em.persist(login);
		em.getTransaction().commit();
		em.getTransaction().begin();
	}

	@Override
	public void saveDetails(UserDetail user) {
		em=dbutil.getEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.getTransaction().begin();
		
		
	}

	
	}


