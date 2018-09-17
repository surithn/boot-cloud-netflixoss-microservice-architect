package com.surith.microservice.counterService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class CounterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterServiceApplication.class, args);
	}
}
