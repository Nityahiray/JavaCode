package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        // list.add(67);
        // list.add(123);
        // list.add(64);
        // list.add(56);
        // list.add(12);
        // list.add(89);

        // System.err.println(list.contains(67));

        // list.set(0, 99);

        // list.remove(2);

        // input

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);

    }
}
