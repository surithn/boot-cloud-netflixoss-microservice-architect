/**
 * 
 */
package com.surith.microservice.counterService.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kxhb130
 *
 */
@RestController
public class FrontController {

	public static final AtomicLong count = new AtomicLong();

	@GetMapping("/counter/getCount")
	public String getCount() {
		return "Count: " + count.getAndIncrement();
	}
}
