package BinarySearch.Question;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr) {
        int pivot = SearchInRotatedSortedArr.findPivot(arr);
        return pivot + 1;
    }
}
