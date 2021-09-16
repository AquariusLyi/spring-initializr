package com.example.springinitializr.juc.dachang.cf02;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @auther zzyy
 * @create 2021-03-02 11:56
 */
public class CompletableFutureDemo {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 20, 1L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(50), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            // 进入异步编排
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
            // 这里如果不用自己创建的线程池threadPoolExecutor，那么会使用默认的forkxxxpoll线程池，而然默认的forkxxxpool线程是守护线程，
            // 主线程退出，导致守护线程也结束，所以就造成了没有计算出值
            // 解决方案：用自己的线程，因为自己创建的线程池是守护线程
        },threadPoolExecutor).whenComplete((v, e) -> {
            if (e == null) {
                System.out.println("----没有异常进行输出"+v);
            }
        }).exceptionally(e -> {
            e.printStackTrace();
            return null;
        });
        System.out.println("main--------结束");
        threadPoolExecutor.shutdown();
    }
}
