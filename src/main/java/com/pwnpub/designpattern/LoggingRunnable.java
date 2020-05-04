package com.pwnpub.designpattern;

/**
 * @author Giannis
 * @date 2019-08-22 15:54
 * @desc
 */
public abstract class LoggingRunnable implements Runnable{

    protected abstract void doRun();
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("Task started at" + startTime);

        doRun();
        System.out.println("Task stopped at " + (System.currentTimeMillis() - startTime));

    }
}
