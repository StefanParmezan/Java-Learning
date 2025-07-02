package Multithreading.ThreadPool.CalculatorProgram;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(CalculatorConnector.add(6, 3));
        System.out.println(CalculatorConnector.add(6, 3));
        System.out.println(CalculatorConnector.add(9, 2));
        System.out.println(CalculatorConnector.minus(9, 2));
        System.out.println(CalculatorConnector.minus(6,1));
        System.out.println(CalculatorConnector.minus(6,2));
    }
}
