public class World implements Runnable{
    public void run() {
        System.out.println("Hello, World!");
    }
    
    public static void main(String[] args) {
        World world = new World();
        Thread thread = new Thread(world);
        thread.start();
    }
    
}
