import java.util.Scanner;

public class SumOfUserData {
    int a, b;

    void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        SumOfUserData sum = new SumOfUserData();
        sum.setData(x, y);
        System.out.println("The sum is " + sum.calculate());
    }
}
