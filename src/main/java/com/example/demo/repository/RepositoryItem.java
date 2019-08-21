package com.example.demo.repository;

import com.example.demo.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryItem extends CrudRepository<Item, Long> {
}
