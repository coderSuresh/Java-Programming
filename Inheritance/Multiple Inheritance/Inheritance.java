import java.util.Scanner;

interface Area {
    int calculate();
}

class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int calculate() {
        return (l*b);
    }
}

class Result extends Rectangle implements Area {
    Result(int l, int b) {
        super(l,b);
    }
    public int calculate() {
        return (l*b);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int x = sc.nextInt();
        System.out.println("Enter breadth: ");
        int y = sc.nextInt();
        Result rect = new Result(x,y);
        System.out.println("Area of Rectangle = " + rect.calculate());
    }
}