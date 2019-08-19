package com.example.demo.service.impl;

import com.example.demo.entity.Item;
import com.example.demo.entity.Purchase;

import java.util.List;
import java.util.Optional;

public interface InterfacePurchase {
    List<Purchase> findAll();
    Optional<Purchase> findById(Long id);
    void store(Purchase purchase);
    void destroy(Long id);
}
