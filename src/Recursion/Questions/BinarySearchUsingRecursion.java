package Recursion.Questions;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(BS(arr, 0, arr.length - 1, 4));
    }

    public static int BS(int[] arr, int start, int end,int tar) {
        if (end >= start && start <= arr.length -1 ) {
            int mid = start + (end - start) /2;

            if (arr[mid] == tar) return mid;
            if (arr[mid] > tar) return BS(arr, start, mid - 1, tar);
            else return BS(arr, mid + 1, end, tar);

        }
        return -1;
    }
    // My Wrong Program
//    public static int BS(int[] arr, int tar) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        if (end >= start && start <= arr.length - 1 ) {
//            int mid = start + (end - start) /2;
//
//            if (arr[mid] == tar) return mid;
//
//            if (arr[mid] > tar) {
//                end = mid - 1;
//                return BS(arr, tar);
//            } else {
//                start = mid + 1;
//                return BS(arr, tar);
//            }
//        }
//        return -1;
//    }
}

