package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 56;
        arr[3] = 67;
        arr[4] = 32;

        System.out.println(arr[3]);

        // input using for loop
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        // print array
        // System.out.println(Arrays.toString(arr));

        // for loop for printing
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // enhanced for loop
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }

        // array of objects
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "nitya";

        in.close();
    }
}