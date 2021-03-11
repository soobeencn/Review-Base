package com.pwnpub.thread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author xb
 * <b>Description: 用于限流</b><br>
 * <b>ProjectName:Review-Base</b>
 * <br><b>PackageName:com.pwnpub.thread</b>
 * <br><b>ClassName:SamephoreDemo</b>
 * <br><b>Date:2020/9/29 14:44</b>
 */
public class SemaphoreDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        Semaphore semaphore = new Semaphore(100);
        for (int i = 0; i < 1000; i++) {
            final int num = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println("Accessing :" + num);
                        Thread.sleep(new Random().nextInt(10));
                        semaphore.release();
                        System.out.println("Release: " + num);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        CyclicBarrier cb = new CyclicBarrier(3);
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3);
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        DelayQueue delayQueue = new DelayQueue();
    }
}
