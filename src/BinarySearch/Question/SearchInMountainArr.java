package BinarySearch.Question;

import BinarySearch.BinarySearch;

public class SearchInMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int FirstTry = BinarySearch.BS(arr, target, 0, peak);

        if (FirstTry != -1) {
            return FirstTry;
        }

        return BinarySearch.BS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid +1;
            }
        }

        return start;
    }
}
