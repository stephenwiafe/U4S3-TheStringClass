package com.codedifferently.labs.partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexingTest {
    @Test
    public void IndexingTest01(){
        String expected = "10";
        String actual = Indexing.index();
        Assertions.assertEquals(expected, actual);
    }
}
