package Multithreading.Methods.Sleep;

public class Sleep {
    public static void main(String[] args) {
        Thread thread = new Thread(new Timer(2, 5));
        thread.start();
        Thread thread2 = new Thread(new Timer(2, 5));
        thread2.start();
    }
}
