package com.codedifferently.labs.partB.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplaceTest {
    @Test
    public void replaceTest01(){
        String expected= "Using StRing Replace to Replace chaRacteR";
        String actual = Replace.sentence();
        Assertions.assertEquals(expected,actual);

    }
}
