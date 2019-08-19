package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float purchasePrice;
    private float sellingPrice;
    private int stock;
    private int sold;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;

    public Item(String name, float purchasePrice, float sellingPrice, int stock, int sold) {
        this.setName(name);
        this.setPurchasePrice(purchasePrice);
        this.setSellingPrice(sellingPrice);
        this.setStock(stock);
        this.setSold(sold);
    }
}
