package com.surith.microservice.gatekeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
@RestController
public class GatekeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatekeeperApplication.class, args);
	}
}
