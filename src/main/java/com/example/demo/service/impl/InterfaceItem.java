package com.example.demo.service.impl;

import com.example.demo.entity.Item;

import java.util.List;
import java.util.Optional;

public interface InterfaceItem {
    List<Item> findAll();
    Optional<Item> findById(Long id);
    void store(Item item);
    void destroy(Long id);
}
