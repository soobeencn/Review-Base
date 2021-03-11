package com.pwnpub.algorithm;

/**
 * @author Giannis
 * @date 2020-07-13 22:21
 * @desc 链表
 */
public class LikedList<E> {

    private class Node {

        E e;
        Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
