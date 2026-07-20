public class shadowing {
    static int x = 90; // this will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x);// 90
        int x; // declared
        x = 40; // class variable at line 4 is shadowed by this and initialzed
        System.out.println(x);// 40 //scope will beginwhen value is initialized
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
