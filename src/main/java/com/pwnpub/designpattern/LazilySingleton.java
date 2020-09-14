package com.pwnpub.designpattern;

/**
 * @author: soobeenwong
 * @date: 2020/9/14 11:41 下午
 * @description: 懒汉式
 */
public class LazilySingleton {

    //1.私有构造函数
    private LazilySingleton() {}
    //2.声明一个本类的引用
    private static LazilySingleton singleton;
    //3.对外提供公共的访问方法
    public static synchronized LazilySingleton getInstance(){

        if (singleton == null) {
            singleton = new LazilySingleton();
        }
        return singleton;

    }
}
