package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String greeting = "Learning Java is a good time!";

        /* Your code goes here*/
        String s1 = greeting.substring(0, 5);
        String s2 = greeting.substring(7, 13);
        String s3 = greeting.substring(7);

        response = s1 + "\n" + s2 + "\n" + s3;

        return response;

    }
    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
