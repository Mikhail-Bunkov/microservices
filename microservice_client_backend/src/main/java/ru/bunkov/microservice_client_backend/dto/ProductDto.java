package ru.bunkov.microservice_client_backend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.bunkov.microservice_client_backend.entity.Product;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private BigDecimal price;

    public ProductDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.price = product.getPrice();
    }
}
