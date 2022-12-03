package Sorting.Questions;

import Sorting.swap;
import java.util.Arrays;
//https://leetcode.com/problems/set-mismatch/submissions/812048624/

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5};
        System.out.println(Arrays.toString(findErrorNum(arr)));
    }

    public static int[] findErrorNum(int[] arr) {
        int i = 0;
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
                return new int[] {index, arr[index] + 1};
            }
        }

        return new int[] {-1, -1};
    }
}
