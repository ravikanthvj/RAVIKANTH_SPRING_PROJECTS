package com.ravikanth.cloudapigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FallBackController {

	@GetMapping("/userservicefallBack")
	public String userSeriveFallBackMethod() {
		
		return "User Service is down  Please Try again later";
	}
	@GetMapping("/DepartmentservicefallBack")
	public String departMentSeriveFallBackMethod() {
		
		return "Department Service is down  Please Try again later";
	}
}
