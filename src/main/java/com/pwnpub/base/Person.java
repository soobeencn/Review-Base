package com.pwnpub.base;

import javax.jnlp.PersistenceService;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Giannis
 * @date 2020-07-13 22:43
 * @desc 构造方法
 */
public class Person{

    String name;
    int age;

    //public Person(){}

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this(name);
        this.age = age;
    }

    void printinfo(){
        System.out.println("我是" + name + ",  我今年" + age + "岁");
    }

    public static void main(String[] args) {

        Person p = new Person("soobeencn", 26);
        p.printinfo();

    }


}
