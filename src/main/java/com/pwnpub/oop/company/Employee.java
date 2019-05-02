package com.pwnpub.oop.company;

import java.util.List;

/**
 * @author soobeenwong
 * @date 2019-04-02 5:10 PM
 * @desc
 */
public class Employee {
    static List<Employee> allEmployees;

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
        this.salary = 0;
    }

    void doWork() {
    }

}
