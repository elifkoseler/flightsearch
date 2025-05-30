package com.elif.flightsearch.controller;

import com.elif.flightsearch.model.Flight;
import com.elif.flightsearch.service.FlightSearchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * This controller handles flight search requests.
 * It provides endpoints to search for available flights between specified locations on a given date.
 * The class acts as a REST API and returns response data in JSON format.
 * Methods defined within this class serve HTTP endpoints for flight search functionalities.
 */
@RestController
@RequestMapping("/flights")
public class FlightSearchController {

    private final FlightSearchService flightSearchService;

    public FlightSearchController(FlightSearchService flightSearchService) {
        this.flightSearchService = flightSearchService;
    }

    @GetMapping
    public List<Flight> getFlights(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String date
    ) {
        return flightSearchService.searchFlights(from, to, date);
    }

    @PostMapping
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight) {
        Flight savedFlight = flightSearchService.saveFlight(flight);
        return new ResponseEntity<>(savedFlight, HttpStatus.CREATED);
    }

}
