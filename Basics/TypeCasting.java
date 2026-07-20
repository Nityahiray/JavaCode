import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);

        // typecating
        // int num = (int) (67.56f);
        // System.out.println(num);

        // automatic type promotion in expressions

        // int a = 257;
        // byte b = (byte) (a); //256 % 256 = 1
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;
        // System.out.println(d);

        // // character
        // int num = 'A';
        // System.out.println(num);

        // System.out.println(3 * 5);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

    }
}
