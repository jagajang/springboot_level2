package com.springboot.chap6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Chap6Application {

	public static void main(String[] args) {
		SpringApplication.run(Chap6Application.class, args);
	}

}
