package com.example.demo.repository;

import com.example.demo.entity.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPurchase extends CrudRepository<Purchase, Long> {
}
