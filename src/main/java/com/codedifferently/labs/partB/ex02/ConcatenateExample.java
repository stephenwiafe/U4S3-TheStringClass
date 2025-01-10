package com.codedifferently.labs.partB.ex02;

public class ConcatenateExample {
    public static String concat(){
        String response = "";
        String myString = "Hello";

        myString = myString + "!";
        response += myString;

        return response;
    }

    public static void main(String[] args) {
        String concat = concat();
        System.out.print(concat);
    }
}