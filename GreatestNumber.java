import java.util.Scanner;
//greatest number among ten using concept of abstract class
abstract class Finder {
    abstract int greatest(int[]array);
}

class Output extends Finder {
    int greatest(int[]arr) {
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }
}

public class GreatestNumber {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[10];
      System.out.println("Enter 10 elements of array: ");
      for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
      }
      Output o = new Output();
      System.out.println(o.greatest(arr)+" is the greatest number.");
  }
}
