package BinarySearch.Question;

import BinarySearch.BinarySearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(arr, target));
        
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return BinarySearch.BS(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[pivot]) {
            return BinarySearch.BS(arr, target, 0, pivot - 1);
        }

        return BinarySearch.BS(arr, target, pivot+1, arr.length - 1);
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }  else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid -1;
            } 
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
