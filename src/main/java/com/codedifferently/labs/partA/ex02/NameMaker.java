package com.codedifferently.labs.partA.ex02;

import java.util.Scanner;

public class NameMaker {
    public static String nameMaker(String firstName, String middleName, String lastName) {
        String response = "";
        String fullName;
        fullName=firstName+" "+middleName+" "+lastName;
        response += ("Your full name is "+ fullName);
        return response;
    }

    public static void main(String[] args) {
        String firstName = "";
        String middleName = "";
        String lastName = "";
        /* Put your code in between these comments : Top */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter middle name:");
        middleName = scanner.nextLine();
        System.out.println("Enter last name:");
        lastName = scanner.nextLine();

        /* Put your code in between these comments : Bottom */
        String fullName  = nameMaker(firstName, middleName, lastName);
        System.out.println(fullName);
    }
}
