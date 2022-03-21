import java.util.Scanner;

public class NestingMethod {
    int l;

    NestingMethod(int l) {
        this.l = l;
    }

    int length() {
        return l;
    }

    int areaCalculator() {
        int l = length();
        return l * l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int x = sc.nextInt();
        NestingMethod n = new NestingMethod(x);
        System.out.println("The area is: " + n.areaCalculator());
    }
}
