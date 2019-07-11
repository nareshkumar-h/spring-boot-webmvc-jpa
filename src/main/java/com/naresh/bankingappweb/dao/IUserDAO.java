package com.naresh.bankingappweb.dao;

import java.util.List;

import com.naresh.bankingappweb.model.User;

public interface IUserDAO {

	void save(User user);

	List<User> list();

}