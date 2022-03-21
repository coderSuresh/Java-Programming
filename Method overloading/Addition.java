public class Addition {
    void sum(int a, int b) {
        System.out.println("The sum is " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("The sum is " + (a + b + c));
    }

    void sum(float a, float b) {
        System.out.println("The sum is " + (a + b));
    }

    public static void main(String[] args) {
        Addition add = new Addition();
        add.sum(3, 4);
        add.sum(3, 4, 5);
        add.sum(3.1f, 4.9f);
    }

}