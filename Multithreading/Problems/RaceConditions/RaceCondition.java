package Multithreading.Problems.RaceConditions;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Runnable th1 = () ->
        {
            for (int i = 0; i < 1000; i++) {
                Counter.Increment();
            }
        };
        Runnable th2 = () ->
        {
            for (int i = 0; i < 1000; i++) {
                Counter.Increment();
            }
        };

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(Counter.getCount());
    }
}
