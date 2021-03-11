package com.pwnpub.casedemo;

/**
 * @author pwnpub.tech
 * @date 2021-01-06 10:59 上午
 * @desc 隐藏域
 **/
public class Conference {

    public static void main(String[] args) {
        System.out.println(new Leader().toString());
    }
}

class Boss {
    private Integer sales = 10000;
}

class Leader extends Boss {

    //public Integer sales = 9000;

    @Override
    public String toString() {
        return super.toString();
    }
}
