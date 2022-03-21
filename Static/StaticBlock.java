public class StaticBlock {
    static int a = 6, b;
    // static block
    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
