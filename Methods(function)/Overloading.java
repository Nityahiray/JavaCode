public class Overloading {
    public static void main(String[] args) {

        // Calling overloaded sum methods
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 7));

        // Calling overloaded fun methods
        // fun(67);
        // fun("Kunal Kushwaha");

    }

    // Method Overloading: same method name, different parameters
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}