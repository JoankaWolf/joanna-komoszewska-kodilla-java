package com.kodilla.stream.array;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        if (numbers == null) {
            return 0.0;
        }
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .mapToDouble(n -> numbers[n])
                .average()
                .orElse(0);

    }
}