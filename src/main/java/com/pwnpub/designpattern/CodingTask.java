package com.pwnpub.designpattern;

/**
 * @author Giannis
 * @date 2019-08-22 15:51
 * @desc 装饰设计模式
 */
public class CodingTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Writing code..");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
