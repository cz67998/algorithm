package com.example.algorithm.LinkedList;

import com.example.algorithm.common.Node;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/3/28
 * Time:15:05
 **/
public class LinkedListCreate {
    /**
     * create a linkedlist
     * 递归
     *
     * @param node
     * @return
     */
    public Node createLinkedList(List<Integer> node) {
        if (node.isEmpty()) {
            return null;
        }
        Node firstNode = new Node(node.get(0));
        Node head = createLinkedList(node.subList(1, node.size()));
        //System.out.println("firstNode:"+firstNode+" head:"+head);
        firstNode.setNext(head);

        return firstNode;
    }

    public Node createLinkedListFor(List<Integer> node) {
        if (node.isEmpty()) {
            return null;
        }
        Node head = new Node(node.get(0));
        Node cur = head;
        for (int i = 1; i < node.size(); i++) {
            cur.setNext(new Node(node.get(i)));
            cur = cur.getNext();
        }
//        Node firstNode = new Node(node.get(0));
//        Node head = createLinkedList(node.subList(1, node.size()));
        //System.out.println("firstNode:"+firstNode+" head:"+head);
//        firstNode.setNext(head);

        return head;
    }


    /**
     * loop   large linkedlist
     *
     * @param size
     * @return
     */
    public Node createLargeLinkedList(int size) {
        Node pre = null;
        Node head = null;
        for (int i = 1; i <= size; i++) {
            Node node = new Node(i);
            if (pre != null) {
                pre.setNext(node);
            } else {
                head = node;
            }
            pre = node;
        }
        return head;
    }

    public static void main(String[] args) {
//        List list = Arrays.asList(1, 1, 1, 1);
//        System.out.println(list);

        LinkedListCreate linkedListCreate = new LinkedListCreate();
        //Node.sysoLinkList(linkedListCreate.createLinkedList(Arrays.asList(1, 2, 3, 4)));
        System.out.println(linkedListCreate.createLinkedListFor(Arrays.asList(1, 2, 3, 4)));
    }
}
