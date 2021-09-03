package com.christiang.HelloWorld;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World!/11");

        /*
        Data Types in Java

        int myInt = 24;
        double myDouble = 24.23;
        float myFloat = 33.2344f;

        boolean myBool = true;
        String myString = "Christian";
        char myChar = 'K';
        */

        IdChecker(23);

        // Method Overloading, same signature with several params.
        CalculateScore("Christian", 240);
        CalculateScore(2300);
        CalculateScore();


    }

    // Function and Conditional Statements
    public static void IdChecker(int age){
        boolean ofAge;
        if(age >= 18){
            ofAge = true;
            System.out.println("Welcome in to the club!");
        } else {
            ofAge = false;
            System.out.println("You can't get in you're too young.");
        }
    }
    // Method Overloading
    public static void CalculateScore(){
        System.out.println("No input?");
    }
    public static int CalculateScore(String name, int Score){
        System.out.println(name + " scored: " + Score + " points!");
        return Score * 100;
    }
    public static int CalculateScore(int GradYear){
        if(GradYear >= 2018){
            System.out.println(1);
            return 1;
        } else {
            return 0;
        }
    };
}
