package com.bidgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
    String firstName, lastName,email,phoneNumber;
    boolean check;
    Scanner scan = new Scanner(System.in);

    public void checkFirstName() {
        System.out.println("Enter First-Name starts with capital letter and has minimum 3 character");
        firstName = scan.nextLine();
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
        if (!check) {
            System.out.println("Invalid!!Please Enter your name according to the instruction");
            checkFirstName();
        } else {
            System.out.println("It's a Valid Firstname");
        }
    }

    //checko lastname method will check the user input according to the given pattern
    public void checkLastName() {
        System.out.println("Enter LastName starts with capital letter and has minimum 3 character");
        lastName = scan.nextLine();
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
        if (!check) {
            System.out.println("Invalid!!!");
            checkLastName();
        } else
            System.out.println("It is a valid lastname");
    }

    //added email method to match the email ids according to given pattern
    public void checkEmail()
    {
        System.out.println("Enter a valid email");
        email=scan.nextLine();
        check=Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
        if (!check) {    System.out.println(" Invalid!!Email-id...Please Enter a Valid one. ");
            checkEmail();
        }
        else {
            System.out.println(" Email-Id is valid ");
        }
    }public void checkPhoneNumber()
    {System.out.println("Enter Your Mobile Number");
        phoneNumber = scan.nextLine();
        check=Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
        if (!check) {
            System.out.println(" Number is invalid!!Please Enter a Valid one. ");
            checkPhoneNumber();
        }
        else {
            System.out.println("Valid Number ");
        }
    }

    public static void main (String[] args)
    {
        Registration reg=new Registration();
        reg.checkFirstName();
        reg.checkLastName();
        reg.checkEmail();
        reg.checkPhoneNumber();}
}