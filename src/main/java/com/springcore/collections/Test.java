package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection-config.xml");
		Employee e1 = (Employee) context.getBean("emp1");
		
		System.out.println(e1);
	}

}
