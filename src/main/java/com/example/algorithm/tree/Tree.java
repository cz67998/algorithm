package com.example.algorithm.tree;

import com.example.algorithm.common.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/4
 * Time:11:19
 **/
public class Tree implements Iterable<TreeNode> {
    private TreeNode head;


    public Tree() {
        InOrder inOrder =new InOrder();
        head = inOrder.first(createSampleTree());

    }

    public TreeNode createSampleTree() {
        TreeNode root = new TreeNode('A');
        root.setLeft(new TreeNode('B'));
        root.getLeft().setLeft(new TreeNode('D'));
        root.getLeft().setRight(new TreeNode('E'));
        root.getLeft().getRight().setLeft(new TreeNode('G'));
        root.setRight(new TreeNode('C'));
        root.getRight().setRight(new TreeNode('F'));
        return root;
    }

    class TreeIterator implements Iterator {
        TreeNode currentNode;

        public TreeIterator(TreeNode head) {
            currentNode = head;
        }

        @Override
        public boolean hasNext() {

            return currentNode != null;
        }

        @Override
        public TreeNode next() {

            if (currentNode == null) {
                throw new NoSuchElementException();
            }
            TreeNode treeNode = currentNode;
            InOrder inOrder = new InOrder();
            currentNode = inOrder.next(currentNode);
            return treeNode;
        }
    }

    @Override
    public Iterator<TreeNode> iterator() {
        return new TreeIterator(head);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        for (TreeNode treeNode : tree) {
            System.out.println(treeNode.getValue());
        }

    }
}
