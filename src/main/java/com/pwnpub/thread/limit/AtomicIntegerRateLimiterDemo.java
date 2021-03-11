package com.pwnpub.thread.limit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author pwnpub.tech
 * @date 2021-03-11 6:31 下午
 * @desc 测试计数器
 **/
public class AtomicIntegerRateLimiterDemo {

    public static void main(String[] args){
        ExecutorService executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        for(int i = 1 ; i <= 100 ; i++){
            AtomicIntegerServiceTask serviceTask = new AtomicIntegerServiceTask("task" + i);
            executor.submit(serviceTask);
        }
    }
}
