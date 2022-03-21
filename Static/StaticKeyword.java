import java.util.Scanner;

// static class
public class StaticKeyword {
    // static variabkes
    static int l, b;

    StaticKeyword(int l, int b) {
        StaticKeyword.l = l;
        StaticKeyword.b = b;
    }
    
    // static method
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
