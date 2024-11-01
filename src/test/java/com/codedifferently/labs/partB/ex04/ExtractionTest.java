package com.codedifferently.labs.partB.ex04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtractionTest {
    @Test
    public void extractionTest01(){
        String expected= "Learn\n" +
                "g Ja\n" +
                "g Java is a good time!";
        String actual = Extraction.extraction();
        Assertions.assertEquals(expected,actual);

    }
}
