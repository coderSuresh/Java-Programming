// while loop is used when we don't know how many times loop is repeated
// it is used if we don't know the exact number if iteration
// this program prints number from 1 to 20

class Print {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            // don't forget to increment the value of i by 1. ( i = i+1);
            i++;
        }
    }
}