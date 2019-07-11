package com.naresh.bankingappweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.bankingappweb.model.User;
import com.naresh.bankingappweb.service.UserService;
@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public @ResponseBody void register(@RequestParam("name")String name,
			@RequestParam("email") String email, @RequestParam("password") String password) {
		System.out.println("UserController->save");
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		userService.registerUser(user);
		
	}
	
	@GetMapping("/list")
//	@PostMapping("/list")
	//@RequestMapping(value="/register", method=RequestMethod.GET, produces = "application/json")
	public List<User> list() {
		List<User> list = userService.list();
		return list;
	}
	
	//@GetMapping("/list")
	@PostMapping("/list")
	//@RequestMapping(value="/register", method=RequestMethod.GET, produces = "application/json")
	public List<User> list1() {
		List<User> list = userService.list();
		return list;
	}
	
	@DeleteMapping("/delete")
	public void delete() {
		
	}
	
	@PutMapping
	public void update() {
		
	}
}
