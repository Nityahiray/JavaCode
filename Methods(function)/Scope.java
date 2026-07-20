public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "nitya";

        {
            // int a = 78; already initialized outside the block in the same method, hence
            // you cannot initialized again
            a = 100; // reassigned the orginal refernce variable to some other value
            System.out.println(a);
            // c = 78;
            int c = 99;
            name = "nitss";
            // value is initialized in this block, will remain in block
        }
        // System.out.println(c); cannot use outside the block
        System.err.println(a);
        System.out.println(name);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
