package com.pwnpub.selfpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Giannis
 * @date 2020-06-18 14:37
 * @desc read code
 */
public class List {


    public static void main(String[] args) {


        /*HashMap map = new HashMap();
        ConcurrentHashMap map1 = new ConcurrentHashMap();

        TreeMap treeMap = new TreeMap<>();
        map.put(null, null);

        Hashtable hashtable = new Hashtable();
        hashtable.put(null, null);

        ThreadLocal threadLocal = new ThreadLocal();


        ConcurrentHashMap map2 = new ConcurrentHashMap();*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0);

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");

        }
        System.out.println();



        System.out.println("此时集合的大小为" + list.size());

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == 3) {
                list.remove(i);
            }


        }

        System.out.println("此时集合大小为：" + list.size());
        for (int i = 0; i < list.size(); i++) {


            System.out.print(list.get(i)+" ");

        }

        System.out.println();
        System.out.println("===============================");

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(1);

        System.out.println(treeSet);

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(1);

        System.out.println(hashSet);













    }

}
