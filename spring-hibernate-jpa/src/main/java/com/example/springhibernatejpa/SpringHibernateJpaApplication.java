package com.example.springhibernatejpa;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories//(basePackages = "com.example.springhibernatejpa")
@EnableWebMvc
//@ComponentScan("com")
public class SpringHibernateJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateJpaApplication.class, args);
	}

}
