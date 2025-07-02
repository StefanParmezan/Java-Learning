package Multithreading.Problems.RaceConditions;

public class Counter {
    private static int count;
    public static synchronized void Increment(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }
}
