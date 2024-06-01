package com.alejandroem.JSON_DB_Bridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JsonDbBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonDbBridgeApplication.class, args);
	}
	
	@Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
