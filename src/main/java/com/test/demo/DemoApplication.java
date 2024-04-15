package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hi");

		//Adding our configuration file
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");

		//Adding our bean
		//This is of student object, so this bean will also be of type student
		Student student1= (Student) context.getBean("student1");
		Student student2= (Student) context.getBean("student2");

		System.out.println(student1);
		System.out.println(student2);
		}
}