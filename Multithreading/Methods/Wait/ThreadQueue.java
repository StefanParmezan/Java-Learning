package Multithreading.Methods.Wait;

import java.util.Deque;
import java.util.LinkedList;

public class ThreadQueue implements Runnable {
    private static final Object lock = new Object(); // Общий монитор
    private final String name;

    public ThreadQueue(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (this.name.equals("1") || this.name.equals("3") || this.name.equals("5") || this.name.equals("7")) {
            synchronized (lock) {  // Ждём на общем мониторе
                try {
                    System.out.println("Ожидаю " + this.name);
                    lock.wait();  // Ждём уведомления
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }

        if (this.name.equals("8")) {
            try {
                for(int i = 0; i <= 5; i++){
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }

            synchronized (lock) {
                System.out.println("Разбужаю всех!");
                lock.notifyAll();  // Разбужу всех, кто ждал
            }
        }

        System.out.println("Поток " + this.name + " работает");
    }
}