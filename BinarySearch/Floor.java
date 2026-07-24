package BinarySearch;

public class Floor {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;

        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // Returns the index greatest no <= target
    static int floor(int[] arr, int target) {

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

        return end;
    }
}