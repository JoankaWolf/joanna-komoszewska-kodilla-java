package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent Africa = new Continent("Africa");
        Africa.addCountry(new Country("Egypt", new BigDecimal(97000100)));
        Africa.addCountry(new Country("Etiopia", new BigDecimal(105000500)));
        Africa.addCountry(new Country("Benin", new BigDecimal(11000500)));
        Africa.addCountry(new Country("Kenia", new BigDecimal(47000500)));

        Continent Europe = new Continent("Europe");
        Europe.addCountry(new Country("Germany", new BigDecimal(80000500)));
        Europe.addCountry(new Country("Poland", new BigDecimal(40000500)));
        Europe.addCountry(new Country("France", new BigDecimal(63000500)));
        Europe.addCountry(new Country("Holland", new BigDecimal(17000500)));

        Continent NorthAmerica = new Continent("North America");
        NorthAmerica.addCountry(new Country("USA", new BigDecimal(308000500)));
        NorthAmerica.addCountry(new Country("Canada", new BigDecimal(33000500)));
        NorthAmerica.addCountry(new Country("Mexico",new BigDecimal(107000500)));
        NorthAmerica.addCountry(new Country("Guatemala", new BigDecimal(15000500)));

        //When
        World peopleInWorld = new World();
        peopleInWorld.addContinent(Africa);
        peopleInWorld.addContinent(Europe);
        peopleInWorld.addContinent(NorthAmerica);

        BigDecimal testQuantityOfPeopleAllWorld = peopleInWorld.getPeopleQuantity();
        BigDecimal expectedPeopleQuantityAllWorld = new BigDecimal(923005600);

        //Then
        Assertions.assertEquals(expectedPeopleQuantityAllWorld, testQuantityOfPeopleAllWorld);
    }
}
