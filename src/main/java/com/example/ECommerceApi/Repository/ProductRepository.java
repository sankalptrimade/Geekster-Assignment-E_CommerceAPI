package com.example.ECommerceApi.Repository;

import com.example.ECommerceApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public List<Product> findByCategory(String category);
}
