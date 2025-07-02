package Multithreading.ThreadPool.ArrayCounter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ArrayCounter {

    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public static int sum(int[] array) throws ExecutionException, InterruptedException {
        List<Integer> a = new ArrayList<Integer>();

        List<Integer> b = new ArrayList<Integer>();

        for (int i = 0; i < array.length / 2; i++) {
            a.add(array[i]);
        }

        for(int i = array.length / 2; i < array.length; i++) {
            b.add(array[i]);
        }

        System.out.println(a);
        System.out.println(b);
        Callable<Integer> sum = new Count(a);
        Future<Integer> future = executor.submit(sum);
        Callable<Integer> sum2 = new Count(b);
        Future<Integer> future2 = executor.submit(sum2);

        return future.get() + future2.get();
    }
}
