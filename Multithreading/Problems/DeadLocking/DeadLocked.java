package Multithreading.Problems.DeadLocking;

public class DeadLocked {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread th1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println(" ");
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
        }, "Th1");

        Thread th2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
            synchronized (lock2) {
                synchronized (lock1) {
                    System.out.println(" ");
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
        }, "Th2");

        th1.start();
        th2.start();

    }
}
