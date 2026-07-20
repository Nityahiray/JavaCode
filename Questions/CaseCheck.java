package Questions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        int a = 10;
        int b = 20;

        // if (a == 10 && b == 20) {
        // System.out.println("Hello world");
        // }

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("uppercase");
        }
    }
}
