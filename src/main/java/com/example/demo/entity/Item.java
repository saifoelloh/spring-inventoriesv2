package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Float purchasePrice;
    private Float sellingPrice;
    private Integer stock;
    private Integer sold;

    @OneToMany(mappedBy = "item")
    List<ItemPurchase> itemPurchases;

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
