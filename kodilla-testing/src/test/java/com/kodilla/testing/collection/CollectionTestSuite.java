package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

@DisplayName("Test OddNumbersExterminator")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("I check if the class behaves correctly when the list is empty.")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator resultNumbers = new OddNumbersExterminator();
        List<Integer> emptyList = List.of();
        //When
        List<Integer> exterminate1 = resultNumbers.exterminate(emptyList);
        //Then
        Assertions.assertEquals(0, exterminate1.size());
        System.out.println("0" + "vs" + exterminate1);
    }
    @DisplayName("I check if the class behaves correctly when the list contains even and odd numbers.")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator resultNumbersList = new OddNumbersExterminator();
        List<Integer> numbersList = Arrays.asList(1, 5, 12, 14, 85, 74, 55);
        List<Integer> evenNumbersList = Arrays.asList(12,14, 74);
        //When
        List<Integer> exterminate2 = resultNumbersList.exterminate(numbersList);
        //Then
        Assertions.assertEquals(evenNumbersList,exterminate2);
        System.out.println(evenNumbersList + "vs" + exterminate2);
    }
}
