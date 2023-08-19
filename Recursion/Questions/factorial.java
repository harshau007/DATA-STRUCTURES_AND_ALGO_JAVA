package com.example.Recursion.Questions;

public class factorial {
    public static void main(String[] args) {
        System.out.println(Factorial(10));
    }

    public static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        // We can also make it sum of n to 1 by replacing "*" with "+"
        return n * Factorial(n -1);
    }
}
