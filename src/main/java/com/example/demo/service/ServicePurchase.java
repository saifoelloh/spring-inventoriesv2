package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.entity.Purchase;
import com.example.demo.repository.RepositoryPurchase;
import com.example.demo.service.impl.InterfacePurchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePurchase implements InterfacePurchase {
    @Autowired
    RepositoryPurchase repositoryPurchase;

    @Override
    public List<Purchase> findAll() {
        return (List<Purchase>) repositoryPurchase.findAll();
    }

    @Override
    public Optional<Purchase> findById(Long id) {
        return (Optional<Purchase>) repositoryPurchase.findById(id);
    }

    @Override
    public void store(Purchase purchase) {
        try {
            repositoryPurchase.save(purchase);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void destroy(Long id) {
        try {
            repositoryPurchase.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
