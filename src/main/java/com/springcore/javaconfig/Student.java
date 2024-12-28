package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("1001")
	private int id;
	
	@Value("ABC")
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
