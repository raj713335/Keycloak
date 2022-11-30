package com.student.studentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.student.controller, com.student.security, com.student.service"})
@EntityScan("com.student.entity")
@EnableJpaRepositories("com.student.repository")
public class StudentAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(StudentAppApplication.class, args);
	}

}
