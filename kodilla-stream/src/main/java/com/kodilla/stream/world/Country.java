package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    public final String countryName;
    public final BigDecimal peopleQuantityInCountry;

    public Country(final String countryName, final BigDecimal peopleQuantityInCountry) {
        this.countryName = countryName;
        this.peopleQuantityInCountry = peopleQuantityInCountry;
    }

    public String getCountyName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantityInCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }
}

