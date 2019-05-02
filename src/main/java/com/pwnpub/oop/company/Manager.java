package com.pwnpub.oop.company;

/**
 * @author soobeenwong
 * @date 2019-04-02 5:10 PM
 * @desc 继承
 */
public class Manager extends Employee {


    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    void doWork() {
        super.doWork();
    }
}
