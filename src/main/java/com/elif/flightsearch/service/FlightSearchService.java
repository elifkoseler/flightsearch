package com.elif.flightsearch.service;

import com.elif.flightsearch.model.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class responsible for searching flights based on specified criteria.
 * This class provides methods to fetch available flights between source and destination
 * locations on a given date. The class handles the business logic for flight searching.
 *
 * Method Details:
 * - searchFlights(String from, String to, String date):
 *   This method retrieves a list of flights matching the provided source, destination, and date.
 *   Each flight includes details such as the flight number, price, and availability status.
 */
@Service
public class FlightSearchService {

    public List<Flight> searchFlights(String from, String to, String date) {
        return List.of(
                new Flight("TK101", from, to, date, 1200.0, true),
                new Flight("TK102", from, to, date, 980.0, true),
                new Flight("TK103", from, to, date, 0.0, false) // fully booked
        );
    }
}
