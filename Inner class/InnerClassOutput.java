import java.util.Scanner;

class InnerClass {
    static class Inner {
        int x, y;

        Inner(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int sum() {
            return x + y;
        }
    }
}

public class InnerClassOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        InnerClass.Inner in = new InnerClass.Inner(x, y);
        System.out.println("Sum = " + in.sum());
    }
}
