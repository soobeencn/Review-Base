package com.pwnpub.key;

/**
 * @author: soobeenwong
 * @date: 2020/9/28 12:15 上午
 * @description:
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal();
        local.set("threadlocal");
        System.out.println(local.get());
        local.remove();
        System.out.println(local.get());
    }
}
