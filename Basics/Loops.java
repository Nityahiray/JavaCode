import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q. print the numbers from 1 to 5

        /*
         * syntax of for loops:
         * for (initialization; condition; increment/decrement){
         * //body
         * }
         */

        // for (int num = 1; num <= 5; num += 1) {
        // System.out.println(num);
        // }

        // print numbers 1 to n
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for (int num = 1; num <= n; num++) {
        // // System.out.println(num + " ");
        // System.out.println("hello");
        // }

        // while loop
        /*
         * syntax:
         * while (condition){
         * //body
         * }
         */

        // int num = 1;
        // while (num <= 5) {
        // System.out.println(num);
        // num += 1;
        // }

        // do while
        // do {
        // body
        // } while (conditions);

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

    }
}
