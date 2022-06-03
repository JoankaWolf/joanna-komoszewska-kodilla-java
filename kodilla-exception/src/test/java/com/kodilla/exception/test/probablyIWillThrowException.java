package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class probablyIWillThrowException {
    @Test
    void testSecondChallengeWithException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5)));
    }
    @Test
    void testSecondChallengeWhenNotTrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 3)),
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2)));
    }
}
