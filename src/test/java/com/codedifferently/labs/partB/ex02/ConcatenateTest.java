package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcatenateTest {

        @Test
        public void nameTest01(){
            String expected= "Abe Lincoln";
            String actual = Concatenate.concatenateStrings();
            Assertions.assertEquals(expected,actual);

        }

}
