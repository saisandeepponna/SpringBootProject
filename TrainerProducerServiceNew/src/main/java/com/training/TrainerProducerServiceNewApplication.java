package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RefreshScope
@EnableSwagger2
@SpringBootApplication

public class TrainerProducerServiceNewApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TrainerProducerServiceNewApplication.class, args);
	}

}
