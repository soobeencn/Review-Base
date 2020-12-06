package com.pwnpub.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: soobeenwong
 * @date: 2020/10/20 5:38 下午
 * @description:
 */
public class ListDemo {

    public static List<String> list = new ArrayList();

    // 进行一些初始化的工作
    static {
        list.add("1");
    }

    public static void main(String[] args) {
        list.stream().forEach(System.out::println);
    }
}
