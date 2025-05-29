package com.elif.flightsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    private String flightNumber;
    private String from;
    private String to;
    private String date; // ISO: 2025-06-01
    private double price;
    private boolean available;
}
