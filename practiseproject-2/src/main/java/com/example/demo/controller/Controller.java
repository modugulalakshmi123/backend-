package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.Repo1;
import com.example.demo.model.model;


@RestController
@CrossOrigin("http://localhost:3000")
	@RequestMapping("/connect")
public class Controller{
	@Autowired
	Repo1 repo;
	@PostMapping("/signupdata")
	public String mthd(@RequestBody model d)
	{
	String user=d.getEmail();

	model m=repo.findByEmail(user);
	if(m==null)
	{
	repo.save(d);
	return "added";
	}
	else
	{
	return "user alredy exist";
	}
	}
	//login
	@PostMapping("/login/{email}/{password}")
	public String login(@PathVariable String
	email,@PathVariable String password)
	{
	model ll=repo.findByEmail(email);
	if(ll == null)
	{
	return "Invalid Email";
	}
	else {

	if(ll.getPassword().equals(password))
	{
	return "Success";
	}
	else
	{
	return "Invalid Password";
	}

	}
	}

	
	@GetMapping("/getdata")
	List<model> getdata(){
		return repo.findAll();

	}
}
	

		
	

	
	


