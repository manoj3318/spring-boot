package com.example.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient


@SpringBootApplication
public class MsEurekaServerHomeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEurekaServerHomeServiceApplication.class, args);
	}

}
