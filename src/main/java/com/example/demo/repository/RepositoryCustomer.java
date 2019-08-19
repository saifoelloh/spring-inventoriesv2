package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCustomer extends CrudRepository<Customer, Long> {
}