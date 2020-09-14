package com.pwnpub.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;

/**
 * @author Giannis
 * @date 2020-09-04 15:15
 * @desc 多线程
 */
public class ThreadTest {

    public static void main(String[] args) {

        ThreadTest test = new ThreadTest();

        Thread thread = new Thread(() -> {
            synchronized (test) {
                try {
                    Thread.sleep(100);
                    test.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }

            LockSupport.park();
        });
        thread.start();

    }

    ConcurrentHashMap map = new ConcurrentHashMap();
    ThreadLocal threadLocal = new ThreadLocal();




}
