package StreamAPI.Day5;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class Calc {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(Calculator.getInstance().multiply(list));
        System.out.println(Calculator.getInstance().add(list));
        Thread.sleep(200);
    }
}
