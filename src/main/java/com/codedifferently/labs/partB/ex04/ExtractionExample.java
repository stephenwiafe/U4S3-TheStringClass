package com.codedifferently.labs.partB.ex04;

public class ExtractionExample {

    public static String extract(){
        String response = "";

        String phoneNumber = "867-5309";
        String subString = phoneNumber.substring(3,6);
        response += subString;


        return response;
    }
    public static void main(String[] args) {
        String extractOutput = extract();
        System.out.print(extractOutput);
    }
}
