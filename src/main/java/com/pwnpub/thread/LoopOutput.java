package com.pwnpub.thread;

/**
 * @author pwnpub.tech
 * @date 2020-12-02 7:10 下午
 * @desc 用10个线程打印1-100
 **/
public class LoopOutput {

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            new Thread(() -> {
                try{
                    System.out.println(finalI);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }).start();
        }
        String a = "1233";
    }
}
