package com.example.demo.repository;

import com.example.demo.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryItem extends CrudRepository<Item, Long> {
}
