package com.kk.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kk.swagger.config.SwaggerConfig;

@SpringBootApplication
@EntityScan(basePackages = "com.kk.spring.entity")
@EnableJpaRepositories(basePackages = "com.kk.spring.repositry")
@ComponentScan(basePackages = "com.kk.spring.controller")
@Import(value = SwaggerConfig.class)
public class SpringBootRestValidationAndSwaggerCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestValidationAndSwaggerCurdApplication.class, args);
	}
}
