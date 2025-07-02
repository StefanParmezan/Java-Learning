package Multithreading.Methods.Wait;

public class Wait {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadQueue("1"));
        Thread thread2 = new Thread(new ThreadQueue("2"));
        Thread thread3 = new Thread(new ThreadQueue("3"));
        Thread thread4 = new Thread(new ThreadQueue("4"));
        Thread thread5 = new Thread(new ThreadQueue("5"));
        Thread thread6 = new Thread(new ThreadQueue("6"));
        Thread thread7 = new Thread(new ThreadQueue("7"));
        Thread thread8 = new Thread(new ThreadQueue("8"));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();;
    }
}
