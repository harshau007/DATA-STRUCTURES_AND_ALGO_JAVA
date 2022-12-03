package Recursion;

public class Recursion {
    public static void main(String[] args) {
        recur(1);
    }

    public static void recur(int n) {
        if (n <= 5) {
            System.out.println(n);
            recur(n + 1);
        }
    }
}
