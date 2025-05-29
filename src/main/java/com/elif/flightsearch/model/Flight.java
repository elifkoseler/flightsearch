package com.elif.flightsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a flight with details such as flight number, departure,
 * destination, date, price, and availability status.
 *
 * Instances of this class are used to encapsulate information about
 * specific flights, including their source and destination locations,
 * travel date, ticket price, and whether seats are available.
 *
 * Fields:
 * - flightNumber: The unique identifier of the flight (e.g., "TK101").
 * - from: Departure location of the flight.
 * - to: Destination location of the flight.
 * - date: Date of travel in ISO format (e.g., "2025-06-01").
 * - price: Ticket price for the flight.
 * - available: Indicates if the flight has available seats.
 */
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
