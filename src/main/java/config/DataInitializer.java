package config;

import com.elif.flightsearch.model.Flight;
import com.elif.flightsearch.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final FlightRepository flightRepository;

    public DataInitializer(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public void run(String... args) {
        flightRepository.save(new Flight(null, "TK101", "IST", "LHR", "2025-06-01", 1200, true));
        flightRepository.save(new Flight(null, "TK102", "IST", "LHR", "2025-06-01", 980, true));
        flightRepository.save(new Flight(null, "TK103", "IST", "LHR", "2025-06-01", 0, false));
    }
}
