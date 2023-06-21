package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.model1;
public interface Repo2 extends JpaRepository<model1, String>
{

	model1 findByName(String name);

	model1 deleteByName(String name);




	
	
}