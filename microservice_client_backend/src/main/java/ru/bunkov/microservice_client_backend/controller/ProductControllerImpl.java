package ru.bunkov.microservice_client_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bunkov.microservice_client_backend.dto.ProductDto;
import ru.bunkov.microservice_client_backend.service.ProductService;
import ru.bunkov.microservice_client_backend.converter.ConvertProductToProductDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/api/v1/products")
public class ProductControllerImpl {
    private final ProductService productService;
    private final ConvertProductToProductDto converter;

    @GetMapping("/products")
    public List<ProductDto> findAll(){
        return converter.convertToDto(productService.findAll());
    }
}
