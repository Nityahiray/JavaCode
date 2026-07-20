package Questions;

public class MethodQuestion {

    public static void main(String[] args) {

        // Print all 3-digit Armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if (isArmStrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check Armstrong number
    static boolean isArmStrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;
    }

    // Method to check Prime number
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        int c = 2;

        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

        return true;
    }
}