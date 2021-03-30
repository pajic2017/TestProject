package com.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		System.out.println("Test");
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
