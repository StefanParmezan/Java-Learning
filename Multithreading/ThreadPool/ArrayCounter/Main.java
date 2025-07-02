package Multithreading.ThreadPool.ArrayCounter;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(ArrayCounter.sum(array));
    }
}
