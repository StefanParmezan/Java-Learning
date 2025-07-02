package Multithreading.KeyWords;

public class Example implements Runnable {
    static volatile boolean running = true;

    @Override
    public void run() {
        while(running) {
            System.out.println("RUNNING");
        }
    }

    public static boolean isRunning() {
        return running;
    }

    public static void setRunning(boolean running) {
        Example.running = running;
    }
}
