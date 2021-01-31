package com.cg.onlinegrocery.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.onlinegrocery.dao.AccountDAO;

public class DBUtils {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
	protected EntityManager em = emf.createEntityManager();

		
}
