// Do while loop is executed once even if the condition is false.
class Print {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Executes even if condition is false");
        } while (i < 0);
        // here i is not less than 0 but it is equal to 0
        // but anyway statement inside of loop is executed once

        // let's have a look at another do-while loop

        int j = 1;
        do {
            System.out.println("j");
            j++;
        } while (j <= 5);

        // this loop prints j five times
        // because the condition is true;
    }
}