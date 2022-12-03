package Sorting.Questions;
//https://leetcode.com/problems/missing-number/submissions/811160459/

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 8, 6, 9, 1, 7, 0};
        System.out.println(Missing(arr));
    }

    static int Missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
