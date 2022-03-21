import java.util.Scanner;

class Triangle {
    int area(int l, int b) {
        return (l * b) / 2;
    }
}

class Rectangle extends Triangle {
    int area(int l, int b) {
        return l * b;
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        System.out.println("Area of triangle = " + t.area(l, b));
        System.out.println("Area of rectangle = " + r.area(l, b));
    }
}
