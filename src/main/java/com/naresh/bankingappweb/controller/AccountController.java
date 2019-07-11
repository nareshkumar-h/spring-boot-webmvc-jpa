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
public class AccountController {

	@PostMapping("/save")
	public void insert() {
		
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable("id") Integer id) {
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id")Integer id) {
		
	}
	
	@GetMapping("/list")
	public void list() {
		
	}
	
	@GetMapping("/findOne/{id}")
	public void findOne(@PathVariable("id") Integer id) {
		
	}
}
