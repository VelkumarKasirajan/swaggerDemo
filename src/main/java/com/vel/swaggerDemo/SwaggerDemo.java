package com.vel.swaggerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.vel.swaggerDemo"})
public class SwaggerDemo {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerDemo.class, args);
	}

}
