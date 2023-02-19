package com.example.ECommerceApi.service;

import com.example.ECommerceApi.Repository.OrderRepository;
import com.example.ECommerceApi.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    public OrderRepository orderRepository;

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }

    public Order findOrderById(int id){
        return orderRepository.findById(id).get();
    }
}
