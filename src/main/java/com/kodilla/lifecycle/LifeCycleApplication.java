package com.kodilla.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LifeCycleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class);
		context.refresh();
		LibraryManager manager = context.getBean(LibraryManager.class);
		System.out.println("Context and beans are set up and ready to work");
		context.close();
		//SpringApplication.run(LifeCycleApplication.class, args);
	}

}
