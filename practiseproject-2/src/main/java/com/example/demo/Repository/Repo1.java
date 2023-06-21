package com.example.demo.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.model;


	public interface Repo1 extends JpaRepository<model, String>
	{

		model findByEmail(String user);
		
	}


