package com.pwnpub.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author pwnpub.tech
 * @date 2021-01-12 11:26 上午
 * @desc
 **/
public class AtomicIntegerTaskTest {


    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS,new SynchronousQueue<>());
        for (int i = 0; i < 100; i++) {
            AtomicIntegerTask thread = new AtomicIntegerTask("task name: " + service);
            service.submit(thread);
        }

    }
}
