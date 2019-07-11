package com.naresh.bankingappweb.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naresh.bankingappweb.model.User;
@Repository
public class UserDAO implements IUserDAO {

	@Autowired
	private EntityManager em;
	
	public void save(User user) {
		em.persist(user);
	}

	public List<User> list() {
		List<User> list = em.createQuery("from User", User.class).getResultList();
		return list;
	}

}
