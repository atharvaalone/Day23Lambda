package com.userregistration;

import java.util.Scanner;


public class UserRegistration {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("User Registration");

        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();


        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter a mobile no ");
        String mobileNo = scanner.nextLine();

        System.out.print("Enter a Password");
        String password = scanner.nextLine();

        boolean isFirstNameValid = firstName.matches("[a-zA-Z]{1,8}");
        boolean isLastNameValid = lastName.matches("[a-zA-Z]{1,8}");
        boolean isEmailValid = email.matches("[a-z0-1.]{1,}[@]{1}[a-z]{1,}[.]{1}[c]{1}[o]{1}[m]{1}");
        boolean isMobileNoValid = mobileNo.matches("[9]{1}[1]{1}[-]{1}[9]{1}[0-9]{9}");
        boolean isPasswordValid = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");

        System.out.println("Username is valid: " + isFirstNameValid);
        System.out.println("Username is valid: " + isLastNameValid);
        System.out.println("Email is valid: " + isEmailValid);
        System.out.println("Mobile no is valid" + isMobileNoValid);
        System.out.println("Password is valid" + isPasswordValid);

        scanner.close();
    }
}



