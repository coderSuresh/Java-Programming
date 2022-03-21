public class Area {
    // declare variables
    int l, b;

    // parameterized constructor
    Area(int l, int b) {
        this.l = l;
        this.b = b;

        // here l in this.l is l declared above the constructor (global variable)
        // and l after '=' symbol is declared inside parenthesis or in Area(). It is
        // local variable of Area() method
    }

    // method to calculate area
    int area() {
        return l * b;
    }

    public static void main(String[] args) {

        // make object of Area class
        // since we have made constructor above, now we can pass values directly from
        // the constructor directly while instantiating or creating objects

        Area a = new Area(4, 2);

        // display the area
        System.out.println("The area is " + a.area());
    }
}