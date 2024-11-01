package com.codedifferently.labs.partB.ex03;

public class ReplaceExample {

    public static String replace(){
        String response = "";

        String replace = "String replace with replace First";
        String newString = replace.replaceFirst("re", "RE");
        response += newString;

        return response;
    }
    public static void main(String[] args) {
        String replacedOutput = replace();
        System.out.println(replacedOutput);
    }
}
