import java.util.Scanner;

public class Calculation {
    int a, b;

    // constructor
    Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

    int div() {
        return a / b;
    }

    int remainder() {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        sc.close();
        Calculation cal = new Calculation(x, y);
        System.out.println("Addition = " + cal.sum());
        System.out.println("Subtracion = " + cal.sub());
        System.out.println("Multiplication = " + cal.mul());
        System.out.println("Division = " + cal.div());
        System.out.println("Remainder = " + cal.remainder());
    }
}
