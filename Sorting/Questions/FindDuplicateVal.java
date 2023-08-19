package Sorting.Questions;
import Sorting.swap;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/811868658/

public class FindDuplicateVal {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,7,2,6,7};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr) {
        int ans = 0;
        int i= 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap.Swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans = arr[index];
            }
        }

        return ans;
    }
}
