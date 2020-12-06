package com.pwnpub.loop;

import com.pwnpub.recursion.LinkedListCreator;
import com.pwnpub.recursion.LinkedListReverser;
import com.pwnpub.recursion.Node;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author soobeenwong
 * @date 2018-11-24 5:23 PM
 * @desc loop
 */
public class LinkedListLoop {

    public Node reverseLinkedList(Node head) {

        Node newHead = null;
        Node curHead = head;

        //loop invariant
        while (curHead != null) {

            //loop invariant holds
            Node next = curHead.getNext();
            curHead.setNext(newHead);
            newHead = curHead;
            curHead = next;

            //loop invariant holds
        }
        return newHead;
    }


    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListReverser reverser = new LinkedListReverser();

        Node.printLinkedList(reverser.reverseLinkedList(
                creator.createLinkedList(new ArrayList<>())));
        Node.printLinkedList(reverser.reverseLinkedList(
                creator.createLinkedList(Arrays.asList(1))));
        Node.printLinkedList(reverser.reverseLinkedList(
                creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));

        reverser.reverseLinkedList(
                creator.createLargeLinkedList(100000)
        );

    }
}
