package com.pwnpub.selfpractice;

import java.util.ArrayList;

/**
 * @author Giannis
 * @date 2020-06-18 14:37
 * @desc read code
 */
public class List {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(8);
        list.add(7);
        list.add(6);

        System.out.println("此时集合的大小为" + list.size());

        for (int i = 0; i < list.size(); i++) {
           if (list.get(i) == 5) {
                list.remove(i);
           }
        }
        System.out.println("此时集合大小为：" + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
