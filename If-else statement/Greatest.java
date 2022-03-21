public class Greatest {
    int a, b, c;

    void setData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void greatestNumber() {
        if (a > b && a > c)
            System.out.println(a + " is the greatest number");
        else if (b > c && b > a)
            System.out.println(b + " is the greatest number");
        else
            System.out.println(c + " is the greatest number");
    }

    public static void main(String[] args) {
        Greatest g = new Greatest();
        g.setData(2, 5, 1);
        g.greatestNumber();
    }
}
