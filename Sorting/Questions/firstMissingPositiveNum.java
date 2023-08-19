package Sorting.Questions;

import Sorting.swap;
//https://leetcode.com/problems/first-missing-positive/submissions/812057564/


public class firstMissingPositiveNum {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(missing(arr));
    }

    static int missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap.Swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }
}
