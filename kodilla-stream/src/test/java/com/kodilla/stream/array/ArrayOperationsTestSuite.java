package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {55, 28, 41, 16, 33, 12, 11, 32, 11, 9, 5, 9, 85, 21, 5, 2, 13, 21, 2, 5};
        double expectedAverage = 20.8;
        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(expectedAverage, average);
    }

    @Test
    void testGetAverageIfNull() {
        //Given
        int [] numbers = new int[0];
        double expectedAverage = 0.0;
        //When
        double average = ArrayOperations.getAverage(null);

        //Then
        assertEquals(expectedAverage, average);
    }
}
