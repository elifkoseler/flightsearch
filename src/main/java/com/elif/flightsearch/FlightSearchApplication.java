package com.elif.flightsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the Flight Search Application.
 *
 * This class serves as the entry point to the Spring Boot application.
 * It uses the @SpringBootApplication annotation, which combines the functionality
 * of @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations.
 *
 * Responsibilities:
 * - Automatically configures the Spring application context.
 * - Scans for Spring components such as controllers, services, and repositories.
 * - Starts the embedded web server, if applicable, to serve the application.
 */

@SpringBootApplication
public class FlightSearchApplication {
	public static void main(String[] args) {
		SpringApplication.run(FlightSearchApplication.class, args);
	}
}
