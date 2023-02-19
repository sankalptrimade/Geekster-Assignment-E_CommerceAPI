package com.example.ECommerceApi.Repository;

import com.example.ECommerceApi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
