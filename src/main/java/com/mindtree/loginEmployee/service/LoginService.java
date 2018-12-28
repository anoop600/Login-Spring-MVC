package com.mindtree.loginEmployee.service;

import com.mindtree.loginEmployee.model.Login;

public interface LoginService {
	void create(Login login);

	Login read(String userName);
}
