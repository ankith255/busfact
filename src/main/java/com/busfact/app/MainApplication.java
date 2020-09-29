package com.busfact.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.busfact.beans.Student;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class MainApplication {

	public static void main(String[] args) {
		init();
		ApplicationContext context = SpringApplication.run(MainApplication.class, args);
		
		
//	   ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
	   
	   Student stu = (Student) context.getBean("Student");
	   
	   System.out.println("Completed....");
	}

	private static void init() {
		
		
		//System.setProperty("spring.main.sources", "config");
		
	}

}
