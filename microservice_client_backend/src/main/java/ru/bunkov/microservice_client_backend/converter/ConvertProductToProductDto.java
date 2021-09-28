package ru.bunkov.microservice_client_backend.converter;

import org.springframework.stereotype.Component;
import ru.bunkov.microservice_client_backend.entity.Product;
import ru.bunkov.microservice_client_backend.dto.ProductDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConvertProductToProductDto {
    public List<ProductDto> convertToDto(List<Product> products) {
        return products.stream().map(ProductDto::new).collect(Collectors.toList());
    }
}
