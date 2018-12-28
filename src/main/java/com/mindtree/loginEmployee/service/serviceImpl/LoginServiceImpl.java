package com.mindtree.loginEmployee.service.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mindtree.loginEmployee.dao.LoginDao;
import com.mindtree.loginEmployee.model.Login;
import com.mindtree.loginEmployee.service.LoginService;

@Component
@Repository
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	@Transactional
	public void create(Login login) {
		
		loginDao.create(login);

	}

	public Login read(String userName) {
		return loginDao.read(userName);

	}

}
