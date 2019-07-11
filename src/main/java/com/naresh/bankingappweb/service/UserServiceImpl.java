package com.naresh.bankingappweb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.bankingappweb.dao.IUserDAO;
import com.naresh.bankingappweb.dao.UserDAO;
import com.naresh.bankingappweb.model.User;
import com.naresh.bankingappweb.validator.UserValidator;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private IUserDAO userDAO;// = new UserDAO();
	
	@Autowired
	private UserValidator userValidator;
		
	@Transactional
	public void registerUser(User user) {
		userValidator.validateUser(user);
		userDAO.save(user);
	}

	@Transactional
	public List<User> list() {
		return userDAO.list();
	}

}
