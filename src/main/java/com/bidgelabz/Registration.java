package com.bidgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
    String firstName, lastName,email,phoneNumber;
    boolean check;
    Scanner scan = new Scanner(System.in);

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
    }
}