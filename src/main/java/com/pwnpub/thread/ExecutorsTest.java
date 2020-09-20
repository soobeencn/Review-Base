package com.pwnpub.thread;

import sun.jvm.hotspot.utilities.soql.Callable;

import javax.script.ScriptException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: soobeenwong
 * @date: 2020/9/20 11:26 下午
 * @description:
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池已启动");
            }
        });
        pool.shutdown();

    }
}
