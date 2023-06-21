package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name="bookingdata1")
public class model1 {
	@Id
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Long phonenumber;

	
}