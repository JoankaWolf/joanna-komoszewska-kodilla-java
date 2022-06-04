package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;


public class testFindFlight {

    @Test
    void testFindFlightWithNoException() {
        //Given
        FindFlight findFlight = new FindFlight();
        Flight flight1 = new Flight("LA", "Sydney");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight3 = new Flight("New York", "Glasgow");
        Map<String, Boolean> flightSearch = findFlight.getFlightSearch();
        flightSearch.put(flight1.getArrivalsAirport(), true);
        flightSearch.put(flight2.getArrivalsAirport(), true);

        //When & Then
        Assertions.assertThrows(RouteNotFoundException.class,() -> findFlight.findFlight(flight3));

        Assertions.assertDoesNotThrow(() -> findFlight.findFlight(flight1));
        Assertions.assertDoesNotThrow(() -> findFlight.findFlight(flight2));
    }

    @Test void testFindFlightWithException () {
        FindFlight findFlight = new FindFlight();
        Flight flight1 = new Flight("LA", "Sydney");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight3 = new Flight("New York", "Glasgow");
        Map<String, Boolean> flightSearch = findFlight.getFlightSearch();
        flightSearch.put(flight1.getArrivalsAirport(), true);
        flightSearch.put(flight2.getArrivalsAirport(), true);

        //When & Then
        Assertions.assertThrows(RouteNotFoundException.class, () -> findFlight.findFlight(flight3));
    }
}