import java.util.Scanner;

public class DaysOfWeek {
    int n;

    void setData(int n) {
        this.n = n;
    }

    void displayDay() {
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Sunday");
                break;
            case 5:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        DaysOfWeek days = new DaysOfWeek();
        days.setData(x);
        days.displayDay();
    }
}
