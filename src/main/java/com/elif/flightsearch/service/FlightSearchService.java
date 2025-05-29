package com.elif.flightsearch.service;

import com.elif.flightsearch.model.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

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
