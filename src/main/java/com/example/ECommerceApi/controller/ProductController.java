package com.example.ECommerceApi.controller;


import com.example.ECommerceApi.model.Product;
import com.example.ECommerceApi.service.ProductService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    public ProductService service;

    @GetMapping(value = "getAllProducts")
    public List<Product> getProductById(@Nullable @RequestParam String category){
        return service.getAllProduct(category);
    }

    @DeleteMapping(value = "deleteProduct/{productId}")
    public void deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
    }
}
