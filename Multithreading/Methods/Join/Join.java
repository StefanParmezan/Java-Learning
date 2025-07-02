package Multithreading.Methods.Join;

import com.sun.jdi.VirtualMachine;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 начал работу");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 закончил работу");
        });
        Thread thread2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 2 работает...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 прерван");
                    break;
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            System.out.println("Thread 3 начал работу");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 3 закончил работу");
        });
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();  // Ждём только thread1

        System.out.println("Thread 1 завершён, продолжаю выполнение в main");
        thread2.interrupt(); // Останавливаем второй поток
    }
}