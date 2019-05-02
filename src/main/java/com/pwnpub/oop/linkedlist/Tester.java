package com.pwnpub.oop.linkedlist;

/**
 * @author soobeenwong
 * @date 2019-04-02 4:36 PM
 * @desc
 */
public class Tester {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }


        //从用户的角度思考问题
        for (Integer value : list) {
            System.out.println(value);
        }

    }

}
