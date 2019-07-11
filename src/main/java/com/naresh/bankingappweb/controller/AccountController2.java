package com.naresh.bankingappweb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController2 {

	// accounts - POST
	@PostMapping()
	public void insert() {
		
	}
	
	// accounts/1 - PUT
	@PutMapping("/{id}")
	public void update(@PathVariable("id") Integer id) {
		
	}
	
	// accounts/1 - Delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id")Integer id) {
		
	}
	
	//accounts - GET
	@GetMapping()
	public void list() {
		
	}
	
	//accounts/1 - GET
	@GetMapping("/{id}")
	public void findOne(@PathVariable("id") Integer id) {
		
	}
}
