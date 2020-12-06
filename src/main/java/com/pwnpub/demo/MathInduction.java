package com.pwnpub.demo;

/**
 * @author soobeenwong
 * @date 2018-11-19 11:36 AM
 * @desc 数学归纳法案例
 */
public class MathInduction {

    public static void main(String[] args) {
        System.out.println(sum(1));
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sum(n - 1) + n;
        }
    }

}
