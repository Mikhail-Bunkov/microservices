package ru.bunkov.microservice_client_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import ru.bunkov.microservice_client_backend.dto.ProductDto;

import java.util.List;

public interface ProductController {
    @GetMapping("/products")
    List<ProductDto> findAll();
}
