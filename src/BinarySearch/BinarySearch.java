package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-4, -2, -1, 0, 2, 5, 8};
        System.out.println(BS(arr, -1));
    }

    public static int BS(int[] arr, int tar) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] > arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == tar) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < tar) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > tar) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
    public static int BS(int[] arr, int tar, int start, int end) {

        boolean isAsc = arr[start] > arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == tar) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < tar) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > tar) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return Integer.MIN_VALUE;
    }
}
