package com.example.ECommerceApi.Repository;

import com.example.ECommerceApi.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
