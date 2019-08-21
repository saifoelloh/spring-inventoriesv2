package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

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
}
