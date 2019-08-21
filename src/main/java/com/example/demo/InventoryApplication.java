package com.example.demo;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Item;
import com.example.demo.entity.Purchase;
import com.example.demo.repository.RepositoryCustomer;
import com.example.demo.repository.RepositoryItem;
import com.example.demo.repository.RepositoryPurchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryApplication {

    @Autowired private RepositoryCustomer repositoryCustomer;
    @Autowired private RepositoryItem repositoryItem;
    @Autowired private RepositoryPurchase repositoryPurchase;

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return args -> {
            Customer customer = new Customer("mmm", "jl sesama", "0841", "hhh@mail.co", 10);
            Item item = new Item("sepatu", 100, 120, 100, 80);
            Purchase purchase = new Purchase();
            customer.getPurchases().add(purchase);
            purchase.setCustomer(customer);
            repositoryCustomer.save(customer);
            repositoryItem.save(item);
            repositoryPurchase.save(purchase);
        };
    }

}
