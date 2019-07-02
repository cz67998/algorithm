package com.example.algorithm.LinkedList;


import com.example.algorithm.common.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/3
 * Time:20:21
 **/
public class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T>  tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(T value) {
        Node<T>  node = new Node<> (value);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }

    class LinkedListIterator implements Iterator<T> {
        Node<T> currentNode;
        public LinkedListIterator(Node<T> head){
            currentNode=head;
        }
        @Override
        public boolean hasNext() {
            return currentNode!=null;
        }

        @Override
        public T next() {
            if (currentNode == null) {
                throw new NoSuchElementException();
            }
            T value = currentNode.getValue();
            currentNode = currentNode.getNext();
            return value;
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator(head);
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }


        for (Integer i :
                linkedList) {
            System.out.println(i);
        }

        LinkedList<String> linkedListString = new LinkedList();
        for (int i = 0; i < 100; i++) {
            linkedListString.add("A");
        }


        for (String i :
                linkedListString) {
            System.out.println(i);
        }

        List<Integer> integerList=new ArrayList<>();
        List objectList2=integerList;
        List<Object> objectList=new ArrayList<>(integerList);
        List<Object> objectList1=(List<Object>)(List) integerList;
        System.out.println(objectList.equals(objectList1));
        objectList2.add("value" );
        System.out.println(objectList2.get(0));
    }
}
