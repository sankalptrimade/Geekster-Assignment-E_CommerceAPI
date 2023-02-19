package com.example.ECommerceApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Address_Table")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "address")
    private String address;
    @Column(name = "landmark")
    private String landmark;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "state")
    private String state;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;
}
