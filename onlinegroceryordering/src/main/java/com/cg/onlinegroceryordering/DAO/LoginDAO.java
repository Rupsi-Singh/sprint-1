package com.cg.onlinegroceryordering.DAO;

import com.cg.onlinegroceryordering.domain.Login;
import com.cg.onlinegroceryordering.domain.UserDetail;

public interface LoginDAO {
	void validateUser(Login login);
	void saveDetails(UserDetail user);
	void logIn(Login login);

}
