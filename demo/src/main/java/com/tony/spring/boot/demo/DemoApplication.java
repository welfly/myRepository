package com.tony.spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.tony.spring.boot.demo",
		"com.tony.spring.boot.demo.controller", 
		"com.tony.spring.boot.demo.pojo",
		"com.tony.spring.boot.demo.service",
		"com.tony.spring.boot.demo.dao"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run(args);
	}
}
