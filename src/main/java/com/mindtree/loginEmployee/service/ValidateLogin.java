package com.mindtree.loginEmployee.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.loginEmployee.configuration.FactoryMethod;
import com.mindtree.loginEmployee.model.Login;

public class ValidateLogin {
	public boolean validate(Login login) {

		ApplicationContext context = new AnnotationConfigApplicationContext(FactoryMethod.class);

		LoginService ls = context.getBean(LoginService.class);
		Login user = ls.read(login.getUserName());
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}
}
