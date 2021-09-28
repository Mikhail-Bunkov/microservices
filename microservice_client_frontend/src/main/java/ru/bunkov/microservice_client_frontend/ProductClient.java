package ru.bunkov.microservice_client_frontend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("eureka-backend-client")
public interface ProductClient {
    @GetMapping("/products")
    List<ProductDto> findAll();
}