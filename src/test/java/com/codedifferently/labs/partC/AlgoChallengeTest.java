package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoChallengeTest {
    // Problem 04 Test
    @Test
    public void missingLetterTest01(){
        // Given
        String word = "kitten";
        int number = 1;

        // When
        String expected = "ktten";
        String actual = AlgoChallenge.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void missingLetterTest02(){
        // Given
        String word = "kitten";
        int number = 0;

        // When
        String expected = "itten";
        String actual = AlgoChallenge.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void missingLetterTest03(){
        // Given
        String word = "kitten";
        int number = 4;

        // When
        String expected = "kittn";
        String actual = AlgoChallenge.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 05 Test
    @Test
    public void wordOfDayTest01() {

        // Given
        String str = "cat";
        // When
        String expected = "tcatt";
        String actual = AlgoChallenge.wordOfDay("cat");
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wordOfDayTest02() {

        // Given
        String str = "Hello";
        // When
        String expected = "oHelloo";
        String actual = AlgoChallenge.wordOfDay("Hello");
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wordOfDayTest03() {

        // Given
        String str = "a";
        // When
        String expected = "aaa";
        String actual = AlgoChallenge.wordOfDay("a");
        // Then
        Assertions.assertEquals(expected, actual);
    }

}
