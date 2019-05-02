package com.pwnpub.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author soobeenwong
 * @date 2018-11-23 3:55 PM
 * @desc 链表创建
 */
public class LinkedListCreator {

    /**
     * creates a linked list.
     *
     * @param data
     * @return head of the linked list.The returned linked list ends with last node with getNext() == null
     */

    public Node createLinkedList(List<Integer> data) {

        if (data.isEmpty()) {
            return null;
        }

        Node firstNode = new Node(data.get(0));

        firstNode.setNext(createLinkedList(data.subList(1, data.size())));
        return firstNode;
    }

    public Node createLargeLinkedList(int size) {
        Node prev = null;
        Node head = null;
        for (int i = 0; i <= size; i++) {
            Node node = new Node(i);
            if (prev != null) {
                prev.setNext(node);
            } else {
                head = node;
            }
            prev = node;
        }
        return head;

    }

    public static void main(String[] args) {

        LinkedListCreator creator = new LinkedListCreator();
        Node.printLinkedList(creator.createLinkedList(new ArrayList<>()));
        Node.printLinkedList(creator.createLinkedList(Arrays.asList(1)));
        Node.printLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5)));

    }

}
