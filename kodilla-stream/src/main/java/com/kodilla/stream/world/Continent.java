package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String ContinentName;
    private final List<Country> continentListOfCountries = new ArrayList<>();

    public void addCountry(Country country){
        continentListOfCountries.add(country);
    }

    public Continent(String continentName) {
        ContinentName = continentName;
    }
    public List<Country> getContinentListOfCountries (){
        return continentListOfCountries;
    }

    public String getContinentName() {
        return ContinentName;
    }
}

