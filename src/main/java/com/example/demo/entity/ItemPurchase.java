package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@Entity
public class ItemPurchase {
    @EmbeddedId
    ItemPurchaseKey id;

    @ManyToOne
    @MapsId("item_id")
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @MapsId("purchase_id")
    @JoinColumn(name = "purchase_id")
    private  Purchase purchase;

    private int tota;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;
}
