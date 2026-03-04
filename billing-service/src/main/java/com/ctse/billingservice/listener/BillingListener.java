package com.ctse.billingservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BillingListener {

    @KafkaListener(topics = "order-topic", groupId = "billing-group")
    public void handleOrder(String order) {
        System.out.println("========================================");
        System.out.println("Billing Service - Received Order Event");
        System.out.println("Order Details: " + order);
        System.out.println("Invoice Generated Successfully!");
        System.out.println("========================================");
    }
}
