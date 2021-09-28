package ru.bunkov.microservice_client_frontend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductClient productClient;

    @RequestMapping("/get-products")
    public List<ProductDto> getProducts() {
        return productClient.findAll();
    }
}
