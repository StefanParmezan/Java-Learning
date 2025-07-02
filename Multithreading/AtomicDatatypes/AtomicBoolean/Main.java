package Multithreading.AtomicDatatypes.AtomicBoolean;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        AtomicBoolean haveMoney = new AtomicBoolean(true);
        new Thread(() -> {
            if(haveMoney.get()) {
                haveMoney.compareAndSet(false, true);
            }
        }).start();

        new Thread(() -> {
            if(haveMoney.get()) {
                haveMoney.compareAndSet(true, false);
            }
        }).start();

        System.out.println(haveMoney.get());
    }
}
