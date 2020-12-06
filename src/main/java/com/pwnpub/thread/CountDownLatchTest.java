package com.pwnpub.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author: soobeenwong
 * @date: 2020/9/21 11:38 下午
 * @description:
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        
        CountDownLatch latch = new CountDownLatch(5);
        LatchDemo demo = new LatchDemo(latch);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            new Thread(demo).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
    }
}

class LatchDemo implements Runnable {
    private CountDownLatch countDownLatch;

    public LatchDemo(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    /**
     * 有参构造
     */
    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
            } finally {
                countDownLatch.countDown();
            }
        }
    }
}
