class Multiplication {

    int n;

    void setData(int n) {
        this.n = n;
    }

    void multiplier() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
        public static void main(String[] args) {
            Multiplication multiplication = new Multiplication();
            multiplication.setData(4);
            multiplication.multiplier();
    }
}
