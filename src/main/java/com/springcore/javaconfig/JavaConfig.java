package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Student getStudent() {
		
		Student s1 = new Student();
		
		return s1;
	}
	
}
