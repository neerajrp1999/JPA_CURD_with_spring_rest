package com.example.finaltest;

import com.example.finaltest.POJO.student;
import com.example.finaltest.Repositry.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FinaltestApplication {
	@Autowired
	StudentRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(FinaltestApplication.class, args);

	}

}