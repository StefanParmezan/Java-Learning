package Multithreading.AtomicDatatypes.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger value = new AtomicInteger(0);
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                value.incrementAndGet();
            }
            System.out.println("1: " + value.get());
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                value.incrementAndGet();
            }
            System.out.println("2: " + value.get());
        }).start();


    }
}
