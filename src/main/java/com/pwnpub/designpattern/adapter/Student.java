package com.pwnpub.designpattern.adapter;

/**
 * @author: soobeenwong
 * @date: 2020/9/20 11:56 下午
 * @description:
 */
public abstract class Student implements Person {
    @Override
    public void eat() {
        System.out.println("eat: 1");
        System.out.println("eat: 2");
        System.out.println("eat: 3");
    }

    @Override
    public void sleep() {
        System.out.println("sleep: 1");
        System.out.println("sleep: 2");
    }

    @Override
    public void study() {
        System.out.println("study: 1");
    }
}
