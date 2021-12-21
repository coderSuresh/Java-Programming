import java.util.Scanner;

public class SumOfUserData {
    int a, b;

    void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        SumOfUserData sum = new SumOfUserData();
        sum.setData(x,y);
        System.out.println("The sum is "+sum.calculate());
    }
}
