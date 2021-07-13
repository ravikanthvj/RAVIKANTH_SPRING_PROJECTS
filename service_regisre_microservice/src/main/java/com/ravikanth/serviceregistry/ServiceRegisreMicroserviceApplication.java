package com.ravikanth.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisreMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisreMicroserviceApplication.class, args);
	}

}
