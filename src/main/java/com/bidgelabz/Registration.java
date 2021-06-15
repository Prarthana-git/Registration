package com.bidgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
        String firstName;
        boolean check;
        Scanner scan=new Scanner(System.in);
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
        public static void main (String[] args)
        {
            Registration reg=new Registration();
            reg.checkFirstName();
        }

    }
