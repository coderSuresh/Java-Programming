public class Adder {
    int a, b;

    void setData(int x, int y) {
        a = x;
        b = y;
    }

    int sum() {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.setData(2, 3);
        System.out.println("The sum is " + adder.sum());
    }
}
