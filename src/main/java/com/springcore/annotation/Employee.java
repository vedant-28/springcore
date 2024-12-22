package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

//	Property injection
//	@Autowired
	private Address address;

//  Constructor injection
//	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

//  setter injection
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
