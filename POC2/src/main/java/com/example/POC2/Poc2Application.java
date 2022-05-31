package com.example.POC2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Poc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Poc2Application.class, args);
	}
 @Bean
 public RestTemplate getRestTemplate() {
     return new RestTemplate();
  }
}
