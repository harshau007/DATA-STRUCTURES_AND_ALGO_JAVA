package com.example.BinarySearch.Question;
// We can't use Array Length function due to it being Infinite array
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class PosInSortedInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 160;

        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target) {
        // Finding Range
        // Start with box of size
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
         }
        return -1;
    }
}
