package com.codedifferently.labs.partA.ex02;

import com.codedifferently.labs.partA.ex01.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameMakerTest {
    @Test
    public void nameTest01(){
        String firstName = "Barak";
        String middleName = "Hussain";
        String lastName = "Obama";
        String expected= "Your full name is Barak Hussain Obama";
        String actual = NameMaker.nameMaker(firstName, middleName, lastName);
        Assertions.assertEquals(expected,actual);

    }
}
