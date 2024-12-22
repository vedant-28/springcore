package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/auto-config.xml");
		Employee emp1 = context.getBean("employee", Employee.class);
		Employee emp2 = context.getBean("employee1", Employee.class);
		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
