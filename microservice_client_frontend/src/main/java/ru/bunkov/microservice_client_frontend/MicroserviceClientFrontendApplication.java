package ru.bunkov.microservice_client_frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroserviceClientFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientFrontendApplication.class, args);
	}

}
