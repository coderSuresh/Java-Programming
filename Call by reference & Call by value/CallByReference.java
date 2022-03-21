public class CallByReference {
    public static void main(String[]args) {
        int a = 4;
        Rectangle r1 = new Rectangle(15,7);
        Rectangle.increment(a); //method call with primitive type parameter
        Rectangle.increment(r1); //method call with object type parameter
        System.out.println("a = " + a);
        r1.display();
    }
}
class Rectangle {
    private int length;
    private int breadth;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    static void increment(int a) {
        a++;
    }
    static void increment(Rectangle r1) {
        r1.length++;
        r1.breadth++;
    }
    public void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
    }
}
