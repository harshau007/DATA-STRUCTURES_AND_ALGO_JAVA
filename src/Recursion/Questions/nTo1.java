package Recursion.Questions;

public class nTo1 {
    public static void main(String[] args) {
        funRev(5);
    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n -1);
    }

    public static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n -1);
        System.out.println(n);
    }
}
