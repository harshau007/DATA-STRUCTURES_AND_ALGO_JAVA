package BinarySearch;
import java.util.Arrays;

public class TwoDBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 12, 15},
                {20, 25, 28},
                {30, 31, 40}
        };

        int target = 31;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] {row, col};
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[] {-1, -1};
    }
}
