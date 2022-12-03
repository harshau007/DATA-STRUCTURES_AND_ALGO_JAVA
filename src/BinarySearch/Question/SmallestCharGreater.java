package BinarySearch.Question;
// 744.Find the smallest letter greater than target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestCharGreater {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};

        System.out.println(smallest(arr, 'a'));
    }

    static char smallest(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}


