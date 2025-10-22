package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String args[]){

        ExecutorService executor = Executors.newFixedThreadPool(4); // 4 threads

        for (int i = 0; i < 4; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Running task " + taskId + " by " + Thread.currentThread().getName());
                // Perform work here
            });
        }

// Shutdown pool gracefully after all tasks finish
        executor.shutdown();

    }
}
