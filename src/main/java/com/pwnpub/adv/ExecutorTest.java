package com.pwnpub.adv;

import javafx.concurrent.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author soobeenwong
 * @date 2019-05-02 7:04 PM
 * @desc 多线程操作
 */
public class ExecutorTest {

    public static void main(String[] args) {

        //new ThreadPoolExecutor(0, 0, 0, null, null);

        ExecutorService executors = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10000; i++) {
            executors.submit(new TaskTest(i));
        }

        System.out.println("10 tasks dispatched successfully");

        executors.shutdown();

    }


}
