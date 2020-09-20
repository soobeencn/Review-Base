package com.pwnpub.designpattern;

/**
 * @author: soobeenwong
 * @date: 2020/9/20 9:45 上午
 * @description:
 */
public class Singleton {

    private Singleton() {}
    private static Singleton singleton;
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
