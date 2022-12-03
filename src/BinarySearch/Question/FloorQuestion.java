package BinarySearch.Question;

public class FloorQuestion {
    public static void main(String[] args) {
//        Fint floor of a number in given array
        int[] arr = {-4, -2, -1, 0, 2, 5, 8, 9, 12, 15, 25, 28, 30};
        System.out.println(floor(arr, 6));
    }

    static int floor(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return Integer.MIN_VALUE;
        }
        int start = 0;
        int end = arr.length - 1;
        int element = Integer.MIN_VALUE;

        boolean isAsc = arr[start] > arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                element = arr[mid];
            } else if (arr[mid] > target){
                element = arr[end - 1];
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return element;
    }
}
