package com.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// In case you have a class outsite the package of SpringApplication, you have to indicate here, if not, it will not take that class
// @ComponentScan(basePackages = {packageName})
public class MicroservicioUdemyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioUdemyApplication.class, args);
	}
}
