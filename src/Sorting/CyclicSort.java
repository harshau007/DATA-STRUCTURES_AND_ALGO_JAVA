package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap.Swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
}
