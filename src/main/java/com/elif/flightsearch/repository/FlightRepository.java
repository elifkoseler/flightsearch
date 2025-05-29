package com.elif.flightsearch.repository;


import com.elif.flightsearch.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByFromAirportAndToAirportAndDate(String from, String to, String date);
}