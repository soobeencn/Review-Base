package com.pwnpub.lang;

/**
 * @author Giannis
 * @date 2020-02-03 19:27
 * @desc 内存模型测试
 */
public class MemoryModel {

    int x, y, x_read, y_read;

    Thread createThread_1() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                x = 1;
                y_read = y;
            }
        });
    }

    Thread createThread_2() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                y = 1;
                x_read = x;
            }
        });
    }

}
