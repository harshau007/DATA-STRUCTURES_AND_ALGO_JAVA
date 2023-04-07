package com.example.Recursion.Questions;

public class palindromeRec {
    public static void main(String[] args) {
        int num = 1212;
        int temp = rev(num, 0);

        if (temp == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int rev(int num, int temp) {
        if (num == 0) {
            return temp;
        }

        temp = (temp * 10) + (num % 10);
        return rev(num / 10, temp);
    }
}
