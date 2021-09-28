package ru.bunkov.microservice_client_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bunkov.microservice_client_backend.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
