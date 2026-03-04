package com.ctse.inventoryservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryListener {

    @KafkaListener(topics = "order-topic", groupId = "inventory-group")
    public void handleOrder(String order) {
        System.out.println("========================================");
        System.out.println("Inventory Service - Received Order Event");
        System.out.println("Order Details: " + order);
        System.out.println("Stock Updated Successfully!");
        System.out.println("========================================");
    }
}
