package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    Map<String, Boolean> flightSearch = new HashMap<>();

    public Map<String, Boolean> getFlightSearch() {
        return flightSearch;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (flightSearch.containsKey(flight.getArrivalsAirport())) {
            if (flightSearch.get(flight.getArrivalsAirport())) {
                System.out.println("Arrivals Airport is open, You can fly");
            } else {
                System.out.println("Airport is closed");
            }
        } else {
            throw new RouteNotFoundException("There is now Airport");
        }
    }
}
