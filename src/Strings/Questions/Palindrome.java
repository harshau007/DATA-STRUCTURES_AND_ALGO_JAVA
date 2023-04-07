package com.example.Strings.Questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        if (isPalindrome(word)) {
            System.out.println("Yes");
        }
    }

    static boolean isPalindrome(String Str) {
        Str = Str.toLowerCase();
        for (int i = 0; i <= Str.length() / 2; i++) {
            char start = Str.charAt(i);
            char end = Str.charAt(Str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
