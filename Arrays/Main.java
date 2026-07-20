package Arrays;

public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a persone name
        String name = "Nitya Hiray";

        // Q: store 5 roll number
        int rollno1 = 23;
        int rollno2 = 56;

        // syntax
        // datatype[] variable name = new datatype[size];
        // int[] rnos = new int [5];
        // or directly
        // int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created in the memory

        // System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        // None in python

        // for (String element : arr) {
        // System.out.println(element);
        // }

    }

}
