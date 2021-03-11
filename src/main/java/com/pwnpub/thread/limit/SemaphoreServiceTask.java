package com.pwnpub.thread.limit;

/**
 * @author pwnpub.tech
 * @date 2021-03-11 6:33 下午
 * @desc Semaphore
 **/

import java.util.concurrent.Semaphore;

public class SemaphoreServiceTask implements Runnable{

    private static Semaphore semphore = new Semaphore(3);

    private String serviceName;

    SemaphoreServiceTask(String serviceName){
        this.serviceName = serviceName;
    }
    @Override
    public void run(){
        if(semphore.getQueueLength() > 10){
            System.out.println("当前等待排队的任务数大于10，请稍候再试...");
            return;
        }
        try {
            semphore.acquire();
            System.out.println("Thread " + serviceName + " is working");
            Thread.sleep(1000);
            System.out.println("Thread " + serviceName + " is over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semphore.release();
        }
    }
}
