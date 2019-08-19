package com.example.demo.service.impl;

import com.example.demo.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface InterfaceCustomer {
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    void store(Customer customer);
    void destroy(Long id);
}
