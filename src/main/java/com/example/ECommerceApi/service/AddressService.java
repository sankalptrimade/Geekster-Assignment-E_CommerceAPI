package com.example.ECommerceApi.service;

import com.example.ECommerceApi.Repository.AddressRepository;
import com.example.ECommerceApi.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    public AddressRepository addressRepository;

    public List<Address> getAllAddress(){
        return addressRepository.findAll();
    }

    public Address getAddressById(int id){
        return addressRepository.findById(id).get();
    }
}
