package StreamAPI.Day5;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class CalculatorService extends Calculator{
    private CalculatorService(){
        super();
    }

    private static CalculatorService instance = new CalculatorService();
    public static CalculatorService getInstance(){
        return  instance;
    }


    public int add(List<Integer> input) throws ExecutionException, InterruptedException {
        return Calculator.getInstance().add(input);
    }
}
