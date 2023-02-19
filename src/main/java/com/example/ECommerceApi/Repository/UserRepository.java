package com.example.ECommerceApi.Repository;

import com.example.ECommerceApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
