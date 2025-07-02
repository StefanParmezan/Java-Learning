package Multithreading.ThreadPool.CalculatorProgram;

import java.util.concurrent.Callable;

public class Calculator implements Callable<Integer> {
    private int num1;
    private int num2;
    private Operations operation;


    public Calculator(int num1, int num2, Operations operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    private Integer Plus() {
        return num1 + num2;
    }

    private Integer Minus() {
        return this.num1 - this.num2;
    }

    @Override
    public Integer call() {
        return switch (this.operation) {
            case PLUS -> Plus();

            case MINUS -> Minus();
        };
    }
}
