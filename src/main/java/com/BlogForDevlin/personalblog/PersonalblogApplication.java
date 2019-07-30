package com.BlogForDevlin.personalblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.BlogForDevlin.mapper")
public class PersonalblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalblogApplication.class, args);
	}

}
