package Recursion.Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(13429));
    }

    public static int sum(int n) {
        int ans = 0;
        if (n > 0) {
            ans = (n % 10) + sum(n / 10);
        }
        return ans;
    }
}
