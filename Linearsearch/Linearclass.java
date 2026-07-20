import java.util.*;

public class Linearclass {

    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 3, 4, 19, -3, -6, 28 };
        int target = 199;

        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // search in the array: return index if found, else -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}