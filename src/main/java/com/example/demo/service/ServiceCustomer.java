package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.RepositoryCustomer;
import com.example.demo.service.impl.InterfaceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCustomer implements InterfaceCustomer {
    @Autowired
    RepositoryCustomer repositoryCustomer;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) repositoryCustomer.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return (Optional<Customer>) repositoryCustomer.findById(id);
    }

    @Override
    public void store(Customer customer) {
        try {
            repositoryCustomer.save(customer);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void destroy(Long id) {
        try {
            repositoryCustomer.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
