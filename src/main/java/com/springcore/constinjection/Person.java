package com.springcore.constinjection;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.id + ": " + this.name;
	}
	
	
}
