package com.pwnpub.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pwnpub.tech
 * @date 2021-01-12 10:08 上午
 * @desc 计数器限流
 **/
public class AtomicIntegerTask implements Runnable{

    private static AtomicInteger count = new AtomicInteger(0);

    private String taskName;

    public AtomicIntegerTask(String taskName) {
        this.taskName = taskName;
    }


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        if (count.get() >= 100) {
            System.out.println("over request time");
        } else {
            count.incrementAndGet();
            System.out.println(count);
        }
    }
}
