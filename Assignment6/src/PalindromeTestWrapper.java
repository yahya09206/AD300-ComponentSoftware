package com.company;

import java.util.Stack;

public class PalindromeTestWrapper {
    final String isMsg = "IS a palindrome";
    final String isNotMsg = "is NOT a palindrome";

    String reverseString = null;

    Stack<Character> stack = new Stack<Character>();

    public boolean isPalindrome(String input) {
        if (input.length() < 2) {
            return true;
        }

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }

        if(input.charAt(0) == input.charAt(input.length() - 1)) {
            return true;
        } else {
            return false;
        }
    }

}