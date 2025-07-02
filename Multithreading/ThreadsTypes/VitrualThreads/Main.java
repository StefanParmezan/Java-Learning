package Multithreading.ThreadsTypes.VitrualThreads;

import java.awt.desktop.SystemSleepEvent;
import java.io.FilterOutputStream;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
          Future<String> result = executorService.submit(new Task("Bro"));
          Future<String> result2 = executorService.submit(new Task("George"));
          Future<String> result3 = executorService.submit(new Task("Skibidi"));
          Future<String> result4 = executorService.submit(new Task("Frank"));

          System.out.println(result.get());
          System.out.println(result2.get());
          System.out.println(result3.get());
          System.out.println(result4.get());

          System.out.println("Virtual thread pool: " + System.currentTimeMillis());
        };

        ExecutorService executorService = Executors.newFixedThreadPool(5) ;{
            Future<String> result = executorService.submit((new Task("Denis")));
            Future<String> result2 = executorService.submit((new Task("Dima")));
            Future<String> result3 = executorService.submit((new Task("Antony")));
            Future<String> result4 = executorService.submit((new Task("Rafaello")));

            System.out.println(result.get());
            System.out.println(result2.get());
            System.out.println(result3.get());
            System.out.println(result4.get());

            System.out.println("Classic thread pool: " + System.currentTimeMillis());
        };
    }
}
