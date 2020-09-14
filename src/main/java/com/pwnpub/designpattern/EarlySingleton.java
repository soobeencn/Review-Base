package com.pwnpub.designpattern;

/**
 * @author: soobeenwong
 * @date: 2020/9/14 11:54 下午
 * @description: 饿汉式
 */
public class EarlySingleton {

    //1.私有构造函数
    private EarlySingleton() {}
    //2.创建本类对象
    private static EarlySingleton earlySingleton = new EarlySingleton();
    //3.对外提供公共的访问方法
    public static EarlySingleton getInstance() {
        return earlySingleton;
    }
}
