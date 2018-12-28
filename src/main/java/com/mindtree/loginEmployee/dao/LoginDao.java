package com.mindtree.loginEmployee.dao;

import com.mindtree.loginEmployee.model.Login;

public interface LoginDao {
	void create(Login login);

	Login read(String userName);
}
