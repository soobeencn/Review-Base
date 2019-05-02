package com.pwnpub.demo;

/**
 * @author soobeenwong
 * @date 2018-11-18 6:29 PM
 * @desc Boxing vs Unboxing
 */
public class BoxingDemo {

    public static void main(String[] args) {

        System.out.println((new Integer(2) == 2));

        System.out.println(new Integer(2) == new Integer(2));

        System.out.println(Integer.valueOf(2) == Integer.valueOf(2));//系统决定

        System.out.println(Integer.valueOf(2).intValue() == 2);//unboxing

        System.out.println(new Integer(2).equals(new Integer(2)));//equals只判断值

    }

}
