package com.example.ECommerceApi.controller;

import com.example.ECommerceApi.model.Order;
import com.example.ECommerceApi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    public OrderService service;

    @GetMapping(value = "getAllOrders")
    public List<Order> getAllOrders(){
        return service.findAllOrders();
    }
    @GetMapping(value = "getOrderById")
    public Order getOrderById(@RequestParam int orderId){
        return service.findOrderById(orderId);
    }
}
