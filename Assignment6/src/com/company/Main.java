package com.company;
import java.util.*;


public class Main {

    public static void main(String args[]) {

        // new instance of the PalindromeTestWrapper class
        com.company.PalindromeTestWrapper palindrome = new com.company.PalindromeTestWrapper();

        // get the user input from scanner
        Scanner scanf = new Scanner(System.in);

        // user input
        String str = null;


        do {
            // ask user for input
            System.out.print("Enter your word (or hit 'return' to finish): ");

            // save the input as string
            str = scanf.nextLine();

            // when the string is a Palindrome
            if (palindrome.isPalindrome(str)) {

                System.out.println(palindrome.isMsg);

            } else {

                System.out.println(palindrome.isNotMsg);
            }
        }

        while (str.length() != 0);
    }

}