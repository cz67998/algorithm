package com.example.algorithm.tree;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/3
 * Time:9:30
 **/
public class InOrder {
    public TreeNode next(TreeNode node) {
        if (node == null) {
            return null;
        }
        if (node.getRight() != null) {
            return first(node.getRight());
        } else {
            while (node.getParent() != null && node.getParent().getRight() == node) {
                node = node.getParent();
            }
            return node.getParent();
        }
    }

    public TreeNode first(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode currentNode = node;
        while (currentNode.getLeft() != null) {
            currentNode = currentNode.getLeft();
        }
        return currentNode;
    }

    public void traverse(TreeNode root){
        for (TreeNode node = first(root); node != null; node = next(node)) {
            System.out.print(node.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeCreate treeCreate = new TreeCreate();
        InOrder inOrder = new InOrder();
        inOrder.traverse(treeCreate.createSampleTree());
        inOrder.next(treeCreate.createSampleTree());
        inOrder.traverse(treeCreate.createTree("","" ));
        inOrder.traverse(treeCreate.createTree("AB","BA" ));
    }
}
