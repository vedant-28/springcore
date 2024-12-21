package com.springcore.constinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constinjection/ci-config.xml");
		Person p1 = (Person) context.getBean("person1");
		
		System.out.println(p1);
	}

}
