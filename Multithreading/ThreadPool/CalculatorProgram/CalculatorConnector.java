package Multithreading.ThreadPool.CalculatorProgram;

import java.util.concurrent.*;

public class CalculatorConnector {
    private static final ExecutorService executor = Executors.newFixedThreadPool(4);

    public static Integer add(int a, int b) throws ExecutionException, InterruptedException {
        Callable<Integer> add = new Calculator(a, b, Operations.PLUS);
        Future<Integer> result = executor.submit(add);
        return result.get();
    }

    public static Integer minus(int a, int b) throws ExecutionException, InterruptedException {
        Callable<Integer> minus = new Calculator(a, b, Operations.MINUS);
        Future<Integer> result = executor.submit(minus);
        return result.get();
    }
}
