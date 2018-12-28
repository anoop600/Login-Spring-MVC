package com.mindtree.loginEmployee.service.validate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.loginEmployee.configuration.FactoryMethod;
import com.mindtree.loginEmployee.model.Login;
import com.mindtree.loginEmployee.service.LoginService;

public class InsertData {
	public boolean addData(Login login) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(FactoryMethod.class);
		LoginService ls = context.getBean(LoginService.class);
		ls.create(login);
		return true;
	}
}
