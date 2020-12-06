package com.pwnpub.oop.linkedlist;

import com.pwnpub.recursion.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author soobeenwong
 * @date 2019-04-02 4:24 PM
 * @desc 链表-->实现Iterable接口
 */
public class LinkedList implements Iterable<Integer> {

    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (tail != null) {
            tail.setNext(node);
        } else {
            head = node;
        }

        tail = node;
    }

    class ListIterator implements Iterator<Integer> {

        Node currentNode;

        //构造函数
        public ListIterator(Node head) {
            currentNode = head;
        }

        @Override
        public boolean hasNext() {
            if (currentNode == null) {
                return false;
            }
            return true;
            // return currentNode != null;
        }

        @Override
        public Integer next() {
            if (currentNode == null) {
                throw new NoSuchElementException();
            }
            int value = currentNode.getValue();
            currentNode = currentNode.getNext();
            return value;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator(head);
    }
}
