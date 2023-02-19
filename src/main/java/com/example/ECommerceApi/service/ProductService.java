package com.example.ECommerceApi.service;

import com.example.ECommerceApi.Repository.ProductRepository;
import com.example.ECommerceApi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;


    public List<Product> getAllProduct(String category) {
        List<Product> products;
        if (category != null) {
            products = new ArrayList<>();
            products.addAll(productRepository.findByCategory(category));
        } else {
            products = productRepository.findAll();
        }
        return products;
    }

    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
}
