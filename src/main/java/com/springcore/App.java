package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/config.xml");
        
        Student student1 = (Student) context1.getBean("student1");
        Student student2 = (Student) context1.getBean("student2");
        
        System.out.println(student1);
        System.out.println(student2);
    }
}
