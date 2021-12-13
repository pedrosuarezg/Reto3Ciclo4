package com.example.reto3ciclo4.interfaces;

import com.example.reto3ciclo4.modelo.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InterfaceOrder extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
}
