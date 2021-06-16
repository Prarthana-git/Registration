package com.bidgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
    String firstName, lastName, email, phoneNumber;
    boolean check;

    public boolean checkFirstName(String name) {
        System.out.println("Enter First-Name starts with capital letter and has minimum 3 character");
        firstName = name;
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
        if (!check) {
            System.out.println("Invalid!!Please Enter your name according to the instruction");
            checkFirstName(name);
        } else {
            System.out.println("It's a Valid Firstname");
        }
        return check;
    }  //checko lastname method will check the user input according to the given pattern

    public boolean checkLastName(String name) {
        System.out.println("Enter LastName starts with capital letter and has minimum 3 character");
        lastName = name;
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
        if (!check) {
            System.out.println("Invalid!!!");
            checkLastName(name);
        } else{
            System.out.println("It is a valid lastname");
             }
           return check;
}
}