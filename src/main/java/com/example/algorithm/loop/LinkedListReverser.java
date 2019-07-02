package com.example.algorithm.loop;

import com.example.algorithm.LinkedList.LinkedListCreate;
import com.example.algorithm.common.Node;

import java.util.Arrays;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/3/29
 * Time:10:23
 **/
public class LinkedListReverser {
    public Node reverseLinkedList(Node head) {
        Node newNode=null;
        Node currentNode=head;
        while(currentNode!=null){
            Node next=currentNode.getNext();
            currentNode.setNext(newNode);
            newNode=currentNode;
            currentNode=next;
        }
        return newNode;
    }

    public static void main(String[] args){
        LinkedListReverser linkedListReverser =new  LinkedListReverser();
        LinkedListCreate linkedListCreate = new LinkedListCreate();
        //Node.sysoLinkList(linkedListReverser.reverseLinkedList(linkedListCreate.createLargeLinkedList(4)));
      System.out.println(linkedListCreate.createLargeLinkedList(4));

    }
}
