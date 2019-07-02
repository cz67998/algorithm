package com.example.algorithm.loop;

import com.example.algorithm.LinkedList.LinkedListCreate;
import com.example.algorithm.common.Node;

import java.util.Arrays;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/1
 * Time:10:48
 **/
public class LinkedListDeleteIf {
    public <T> Node<T> linkedListDeleteIfValueEquels(Node head, T value) {

        while(head!=null&&head.getValue()==value){
            head=head.getNext();
        }
        if (head == null) {
            return null;
        }
        Node previousNode = head;
        while (previousNode.getNext() != null) {
            if (previousNode.getNext().getValue() == value) {
                previousNode.setNext(previousNode.getNext().getNext());
            } else {
                previousNode = previousNode.getNext();
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListCreate linkedListCreate = new LinkedListCreate();
        LinkedListDeleteIf linkedListDeleteIf = new LinkedListDeleteIf();
        Node.sysoLinkList(linkedListDeleteIf.linkedListDeleteIfValueEquels(linkedListCreate.createLinkedList(Arrays.asList(2, 2, 3, 4, 2)), 2));
        // System.out.println(linkedListCreate.createLinkedList(Arrays.asList(1,2,3,4,2)));

    }
}
