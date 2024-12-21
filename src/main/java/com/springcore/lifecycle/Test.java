package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// AbstractApplicationContext is a parent interface ApplicationContext which enables lifecycle destroy() method
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle-config.xml");
		Samosa s1 = (Samosa) context.getBean("s1");
		
		System.out.println(s1);
		
		context.registerShutdownHook();
	}

}
