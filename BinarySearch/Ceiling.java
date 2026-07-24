package BinarySearch;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45 };
        int target = -12;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // Returns the index
    // Returns -1 if the target does not exist
    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // Find the middle element
            // This formula prevents integer overflow
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // Target found
                return mid;
            }
        }

        return start;
    }
}