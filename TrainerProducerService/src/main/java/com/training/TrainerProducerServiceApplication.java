package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class TrainerProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainerProducerServiceApplication.class, args);
	}

}
