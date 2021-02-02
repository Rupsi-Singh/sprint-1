package com.cg.onlinegroceryordering.service;

import com.cg.onlinegroceryordering.domain.Login;
import com.cg.onlinegroceryordering.domain.UserDetail;

public interface LoginService {
	
	void registerUser(UserDetail user1);
	//boolean validateUser(Login login);
	boolean validatePassword(UserDetail user);
	void details(UserDetail user);
	boolean validateUser(UserDetail user1);

}
