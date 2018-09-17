/**
 * 
 */
package com.surith.microservice.feignClient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kxhb130
 *
 */
@FeignClient("counter-service")
public interface CounterClient {
	
	@GetMapping("/counter/getCount")
	public String getCount();
}
