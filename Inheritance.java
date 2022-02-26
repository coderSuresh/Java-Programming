import java.util.Scanner;

class Inherit {
    int l, b;

    Inherit(int l, int b) {
        this.l = l;
        this.b = b;
    }
}

class Traingle extends Inherit {
    Traingle(int l, int b) {
        super(l, b);
    }

    int area() {
        return  (l*b)/2;
    }
}

class Rectangle extends Inherit {
    Rectangle(int l, int b) {
        super(l, b);
    }

    int area() {
        return l * b;
    }
}

class Square extends Inherit {
    Square(int l, int b) {
        super(l, b);
    }

    int area() {
        return l * l;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int x = sc.nextInt();
        System.out.println("Enter breadth: ");
        int y = sc.nextInt();
        Traingle t = new Traingle(x, y);
        Rectangle r = new Rectangle(x, y);
        Square s = new Square(x, y);
        System.out.println("Area of traingle = " + t.area());
        System.out.println("Area of rectangle = " + r.area());
        System.out.println("Area of square = " + s.area());
    }
}