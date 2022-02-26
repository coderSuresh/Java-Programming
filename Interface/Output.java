import java.util.Scanner;

interface Calculator {
    public void area();
}

class Printer implements Calculator {
    int l, b;

    Printer(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("The area is " + l * b);
    }
}

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int x = sc.nextInt();
        System.out.println("Enter breath: ");
        int y = sc.nextInt();
        Printer p = new Printer(x, y);
        p.area();
    }
}