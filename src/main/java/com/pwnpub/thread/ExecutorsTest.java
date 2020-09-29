package com.pwnpub.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: soobeenwong
 * @date: 2020/9/20 11:26 下午
 * @description:
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池已启动");
            }
        });
        pool.shutdown();
    }
}
