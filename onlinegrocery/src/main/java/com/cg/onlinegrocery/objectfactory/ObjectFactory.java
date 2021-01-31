package com.cg.onlinegrocery.objectfactory;

import com.cg.onlinegrocery.daoimpl.AccountDAOImpl;
import com.cg.onlinegrocery.serviceimpl.AccountServiceImpl;

public class ObjectFactory {
	public static Object getBean(String className) {
		Object object = null;
		if(className.equals("accountDAOImpl")) {
			object=new AccountDAOImpl();
		}
		
		if(className.equals("accountServiceImpl")) {
			object=new AccountServiceImpl();
		}
		return object;
	}

}
