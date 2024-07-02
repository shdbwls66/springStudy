package com.ormi.springstudy.spring0628;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> {
                Singleton.getInstance().incrementCount();
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("예상 값: 1000");
        System.out.println("실제 값: " + Singleton.getInstance().getCount());
    }
}
