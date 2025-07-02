package Multithreading.KeyWords;

public class Volatine {
    public static void main(String[] args) throws InterruptedException {
        Thread Example1 = new Thread(new Example());
        Example1.start();
        Thread Example2 = new Thread(new Example());
        Example2.start();
        Thread Example3 = new Thread(new Example());
        Example3.start();
        Thread.sleep(3000);
        Example.setRunning(false);

    }
}
