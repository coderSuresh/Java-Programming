import java.util.Scanner;

public class CallByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("In call by value, the modification done to the parameter passed does not reflect in the caller's scope:");
        System.out.println("Before swapping, a = " + a + " and b = " + b);
        swapNumber(a, b);
        System.out.println("After swapping, a = " + a + " and b is " + b);
    }
    public static void swapNumber(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}