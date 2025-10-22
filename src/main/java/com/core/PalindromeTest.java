package com.core;

public class PalindromeTest {

    public static void main(String args[]){
        PalindromeTest insta = new PalindromeTest();
        insta.isPalindrome(121);

    }

    public boolean isPalindrome(int x) {

        // Store original number
        int originalNumber = x;
        int reversedNumber = 0;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10; // Extract last digit
            System.out.println("extract last digit "+digit);
            reversedNumber = reversedNumber * 10 + digit; // Build reversed number
            System.out.println("building reversedNumber "+digit);
            x = x / 10; // Remove last digit
            System.out.println("Remove last digit "+x);
        }

        // Check if palindrome
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
            return true;
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
            return false;
        }

    }

}
