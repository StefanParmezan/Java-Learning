package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class AsyncMath {
    CompletableFuture<Double> plus(CompletableFuture<Double> f1, CompletableFuture<Double> f2) {
        return f1.thenCombine(f2, Double::sum);
    }

    CompletableFuture<Double> minus(CompletableFuture<Double> f1, CompletableFuture<Double> f2) {
        return f1.thenCombine(f2, Double::min);
    }
}
