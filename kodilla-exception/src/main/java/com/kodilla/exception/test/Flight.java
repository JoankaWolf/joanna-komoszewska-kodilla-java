package com.kodilla.exception.test;

public class Flight {
    private String departureAirport;
    private String arrivalsAirport;

    public Flight(String departureAirport, String arrivalsAirport) {
        this.departureAirport = departureAirport;
        this.arrivalsAirport = arrivalsAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalsAirport() {
        return arrivalsAirport;
    }
}
