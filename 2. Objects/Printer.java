// in java object is used to access methods or data from the class

class Printer {

    // simple method that prints hello world and returns nothing
    void print() {
        System.out.println("Hello, world");
    }

    // main method which is executed first
    public static void main(String[] args) {
        // Create object of class to access print() method
        // if we don't create object here, we won't see output

        // To create a object of the class, there are two steps
        // 1. declare variable of class type
        // our class is Printer and we are going to declare 'p' variable

        // Printer p;

        // 2. another step is to instantiate the object using constructor of
        // class ('Printer()' in our case) preeceeded by 'new' keyword

        // p = new Printer();

        // we can also combine these two steps in single line as:
        Printer p = new Printer();

        // now we can call print() method using this object to see output
        // to call, we must write objectName.methodName();
        // in our case, objectName is p and methodName is print()

        p.print();
    }
}