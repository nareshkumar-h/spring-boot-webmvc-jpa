package com.naresh.bankingappweb.service;

import java.util.List;

import javax.transaction.Transactional;

import com.naresh.bankingappweb.model.User;

public interface UserService {

	void registerUser(User user);

	List<User> list();

}