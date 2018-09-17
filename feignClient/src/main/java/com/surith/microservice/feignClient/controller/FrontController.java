package com.surith.microservice.feignClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surith.microservice.feignClient.service.CounterClient;

@RestController
public class FrontController {

	@Autowired
	CounterClient counterClient;
	
	@GetMapping("/feign/hits")
	public String getHits() {
		return counterClient.getCount();
	}
}
