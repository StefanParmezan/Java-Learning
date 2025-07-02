package Multithreading.ThreadPool.ArrayCounter;

import java.util.List;
import java.util.concurrent.Callable;

public class Count implements Callable<Integer> {
    List<Integer> a;


    public Count(List<Integer> a) {
        this.a = a;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(Integer i : a) {
            sum+= i;
        }
        return sum;
    }
}
