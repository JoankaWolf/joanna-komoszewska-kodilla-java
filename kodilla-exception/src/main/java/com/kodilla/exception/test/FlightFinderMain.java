package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinderMain {

    public static void main(String[] args) {
        FindFlight findFlight = new FindFlight();
        Flight flight1 = new Flight("LA", "Sydney");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight3 = new Flight("New York", "Glasgow");
        Flight flight4 = new Flight("Berlin", "Pisa");
        Flight flight5 = new Flight("Krakow", "Amsterdam");

        Map<String, Boolean> flightSearch = findFlight.getFlightSearch();
        flightSearch.put(flight1.getArrivalsAirport(), true);
        flightSearch.put(flight2.getArrivalsAirport(), false);
        flightSearch.put(flight3.getArrivalsAirport(), true);
        flightSearch.put(flight4.getArrivalsAirport(), true);

        try {
            findFlight.findFlight(flight1);
            findFlight.findFlight(flight3);
            findFlight.findFlight(flight2);
            findFlight.findFlight(flight5);


        } catch (RouteNotFoundException e) {
         //   throw new RuntimeException(e);
            System.out.println("There is now Airport");
        }
    }
}