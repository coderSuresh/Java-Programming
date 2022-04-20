class Hello extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.start();
    }
}