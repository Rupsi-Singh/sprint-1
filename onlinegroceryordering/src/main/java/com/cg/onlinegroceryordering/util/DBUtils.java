package com.cg.onlinegroceryordering.util;


import javax.persistence.*;

public class DBUtils {
	
	
	public EntityManager getEntityManager()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		return em;
		
	}
	
}
