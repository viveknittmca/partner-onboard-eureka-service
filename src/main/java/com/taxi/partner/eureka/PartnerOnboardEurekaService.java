package com.taxi.partner.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PartnerOnboardEurekaService {

	public static void main(String[] args) {
		SpringApplication.run(PartnerOnboardEurekaService.class, args);
	}

}
