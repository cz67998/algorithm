package com.example.algorithm.LinkedList;

import com.example.algorithm.common.Node;

import java.util.Arrays;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/3/28
 * Time:17:07
 **/
public class LinkedListReverser {
    public Node reverserLinkedList(Node head) {
        if (head == null||head.getNext() == null) {
            return head;
        }
        Node firstNode = reverserLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return firstNode;
    }

    public static void main(String[] args) {
        LinkedListReverser linkedListReverser = new LinkedListReverser();
        LinkedListCreate linkedListCreate = new LinkedListCreate();
        Node.sysoLinkList(linkedListReverser.reverserLinkedList(linkedListCreate.createLinkedList(Arrays.asList(1,2,3,4))));
    }
}
