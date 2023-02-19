package com.example.ECommerceApi.controller;

import com.example.ECommerceApi.model.Address;
import com.example.ECommerceApi.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService service;

    @GetMapping(value = "getAllAddress")
    public List<Address> getAllAddress() {
        return service.getAllAddress();
    }

    @GetMapping(value = "getAddressById")
    public Address getAddressById(@RequestParam int addressId) {
        return service.getAddressById(addressId);
    }
}
