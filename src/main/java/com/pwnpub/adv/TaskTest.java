package com.pwnpub.adv;

/**
 * @author soobeenwong
 * @date 2019-05-02 7:30 PM
 * @desc 多线程任务测试
 */
public class TaskTest implements Runnable {


    private int startedNum;

    public TaskTest(int startedNum) {
        this.startedNum = startedNum;
    }

    @Override
    public void run() {

        System.out.println("第" + startedNum + "次说：" + "我爱潘圈圈");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
