public class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println("Addition="+m.add(3,4));
        System.out.println("Addition="+m.add(3,4,1));
        System.out.println("Addition="+m.add(3.4f, 1.6f));
    }
}
