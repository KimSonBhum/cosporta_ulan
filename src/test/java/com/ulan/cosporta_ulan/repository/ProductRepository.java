package com.ulan.cosporta_ulan.repository;


import com.ulan.cosporta_ulan.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository <Product, Long> {
    Optional<Product> findByName(String name);
}
