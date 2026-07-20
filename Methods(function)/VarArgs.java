import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        // Calling fun() with variable number of integers
        fun(2, 3, 4, 5);

        // Calling multiple()
        multiple(2, 3, "Kunal", "Rahul");
    }

    // Variable-length arguments must always be at the end
    static void multiple(int a, int b, String... v) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Names = " + Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}