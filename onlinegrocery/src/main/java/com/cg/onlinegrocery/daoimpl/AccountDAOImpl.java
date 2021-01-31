package com.cg.onlinegrocery.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.onlinegrocery.dao.AccountDAO;
import com.cg.onlinegrocery.domain.Account;
import com.cg.onlinegrocery.domain.Admin;
import com.cg.onlinegrocery.domain.Customer;
import com.cg.onlinegrocery.domain.StoreIncharge;
import com.cg.onlinegrocery.util.DBUtils;

public class AccountDAOImpl extends DBUtils implements AccountDAO {
	

    
    
    //public AccountDAOImpl() {
		// TODO Auto-generated constructor stub
	//}
    
    @Override
	public void adminDetails(Admin admin) {
  
		admin.setAdminEmail("ad@gmail.com");
		admin.setAdminPhone("9876452721");
		em.getTransaction().begin();
		em.persist(admin);
		em.getTransaction().commit();
		em.close();
		
	}
	
	@Override
	public void logIn(Account account) {
		account.setUserName("rupsi");
		account.setPassword("abc@123");
		account.setUserRole(1);
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
	    em.close();
		
	}
	@Override
	public void customerDetails(Customer customer) {
		customer.setCustomerPhone("9368292327");
		customer.setCustomerAddress("Main road ranchi");
		customer.setCustomerEmail("cu@gmail.com");
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
	    em.close();
		
	}
	@Override
	public void storeINchargeDetails(StoreIncharge storeIncharge) {
		storeIncharge.setStoreInchargeEmail("st@gamil.com");
		storeIncharge.setStoreInchargePhone("9852742413");
		em.getTransaction().begin();
		em.persist(storeIncharge);
		em.getTransaction().commit();
	    em.close();
		
	}
	

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> findAlll() {
		// TODO Auto-generated method stub
		return null;
	}
}
