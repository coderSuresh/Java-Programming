class Area {
    int length, breadth;

    void setData(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("The area of reactangle is " + length * breadth);
    }

    public static void main(String[] args) {
        Area area = new Area();
        area.setData(5, 2);
        area.area();
    }
} 
