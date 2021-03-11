package com.pwnpub.thread.limit;

/**
 * @author pwnpub.tech
 * @date 2021-03-11 6:30 下午
 * @desc 计数器限流
 **/
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerServiceTask implements Runnable{

    private static AtomicInteger count = new AtomicInteger(0);

    private String serviceName;

    AtomicIntegerServiceTask(String serviceName){
        this.serviceName = serviceName;
    }

    public void run() {
        if (count.get() >= 5) {
            System.out.println("请求用户过多，请稍后在试！");
        } else {
            try {
                System.out.println("Thread " + serviceName + " is working");
                count.incrementAndGet();
                Thread.sleep(1000);
                System.out.println("Thread " + serviceName + " is over");
            } catch (InterruptedException e) {
                System.out.println("error ...." + e.getMessage());
            }
        }
    }
}
