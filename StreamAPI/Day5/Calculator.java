package StreamAPI.Day5;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {
    protected static Calculator instance = new Calculator();
    Calculator(){};

    protected int add(List<Integer> input) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        return executorService.submit(() -> input.stream().reduce(0,(a, b) -> a + b, Integer::sum)).get();
    }

    protected int multiply(List<Integer> input) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        return executorService.submit(() -> input.stream().reduce(1,(a, b) -> a * b, Integer::sum)).get();
    }

    protected static Calculator getInstance(){
        return instance;
    }
}
