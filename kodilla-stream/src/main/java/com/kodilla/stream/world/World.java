package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    public final List<Continent> continentsInWorldList = new ArrayList<>();
    public void addContinent(Continent continent) {
        continentsInWorldList.add(continent);
    }

    BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantityAllWorld = continentsInWorldList.stream()
                .flatMap(continent -> continent.getContinentListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return peopleQuantityAllWorld;
    }
}
