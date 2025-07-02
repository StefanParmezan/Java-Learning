package Multithreading.ThreadsTypes.VitrualThreads;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        return "You name is " + name;
    }
}
