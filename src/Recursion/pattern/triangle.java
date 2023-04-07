package com.example.Recursion.pattern;

public class triangle {
    public static void main(String[] args) {
        tri(4, 0);
    }

    public static void tri(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r ){
            System.out.print("*");
            tri(r, c+1);
        } else {
            System.out.println();
            tri(r-1, 0);
        }
    }
}
