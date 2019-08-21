package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@AllArgsConstructor
@Data
@Embeddable
public class ItemPurchaseKey {
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "purchase_id")
    private Long purchaseId;
}
