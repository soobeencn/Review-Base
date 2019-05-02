package com.pwnpub.recursion;

/**
 * @author soobeenwong
 * @date 2018-11-23 3:56 PM
 * @desc 节点信息
 */
public class Node {

    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.getValue());
            System.out.print(" ");
            head = head.getNext();
        }
        System.out.println("");
    }

}
