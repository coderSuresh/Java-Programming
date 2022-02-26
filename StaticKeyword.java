import java.util.Scanner;

public class StaticKeyword {
    static int l, b;

    StaticKeyword(int l, int b) {
        this.l = l;
        this.b = b;
    }
    
    static int area() {
        return l * b;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        StaticKeyword s = new StaticKeyword(l, b);
        System.out.println("The area is: " + area());; //access without object
    }
}
