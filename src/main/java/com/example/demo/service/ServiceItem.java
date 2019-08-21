package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.repository.RepositoryItem;
import com.example.demo.service.impl.InterfaceItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceItem implements InterfaceItem {
    @Autowired
    RepositoryItem repositoryItem;

    @Override
    public List<Item> findAll() {
        return (List<Item>) repositoryItem.findAll();
    }

    @Override
    public Optional<Item> findById(Long id) {
        return (Optional<Item>) repositoryItem.findById(id);
    }

    @Override
    public void store(Item item) {
        try {
            repositoryItem.save(item);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void destroy(Long id) {
        try {
            repositoryItem.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
