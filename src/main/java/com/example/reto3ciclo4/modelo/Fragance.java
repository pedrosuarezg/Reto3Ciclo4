package com.example.reto3ciclo4.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author PSG94
 */

@Document(collection = "perfumes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Fragance {

    @Id

    private String reference;
    private String brand;
    private String category;
    private String presentation;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}
