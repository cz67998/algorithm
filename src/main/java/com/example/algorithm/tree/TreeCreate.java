package com.example.algorithm.tree;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/1
 * Time:14:31
 **/
public class TreeCreate {
    /**
     * 模板树
     *
     * @return
     */
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

    public TreeNode createTree(String preTree, String inTree) {
        if (preTree.isEmpty()) {
            return null;
        }
        char index = preTree.charAt(0);
        int indexValue = inTree.indexOf(index);
        TreeNode treeNode = new TreeNode(index);
        treeNode.setLeft(createTree(preTree.substring(1, indexValue + 1), inTree.substring(0, indexValue)));
        treeNode.setRight(createTree(preTree.substring(indexValue + 1), inTree.substring(indexValue + 1)));
        return treeNode;
    }

}
