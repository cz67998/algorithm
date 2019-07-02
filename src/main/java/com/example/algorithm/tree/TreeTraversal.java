package com.example.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/1
 * Time:20:26
 **/
public class TreeTraversal {
    /**
     * 前序遍历
     *
     * @param root
     */
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    /**
     * 中序遍历
     */
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getValue());
        inOrder(root.getRight());
    }

    /**
     * 后序遍历
     *
     * @param root
     */
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue());
    }

    /**
     * 根据前序和中序遍历输出后序遍历
     *
     * @param preTree
     * @param inTree
     * @return
     */
    public String postTree(String preTree, String inTree) {
        if (preTree.isEmpty()) {
            return "";
        }
        char index = preTree.charAt(0);
        int indexValue = inTree.indexOf(index);
        return postTree(preTree.substring(1, indexValue + 1), inTree.substring(0, indexValue)) +
                postTree(preTree.substring(indexValue + 1), inTree.substring(indexValue + 1)) + index;
    }


    /**
     * 根据前序和后序计算可能出现的二叉树
     *
     * @param preTree
     * @param postTree
     * @return
     */
    public int count(String preTree, String postTree) {
        if (preTree.length() == 1) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < preTree.length() - 1; i++) {
            for (int j = 1; j <= postTree.length() - 1; j++) {
                if (preTree.charAt(i) == postTree.charAt(j) && preTree.charAt(i + 1) == postTree.charAt(j - 1)) count++;
            }
        }
        return count * 2;
    }

    public TreeNode inTree(String preTree, String laterTree) {

        if (preTree.isEmpty()) {
            return null;
        }

        char firstPreTree = preTree.charAt(0);
        TreeNode treeNode = new TreeNode(firstPreTree);
        if (preTree.length() == 1) {
            return treeNode;
        }
        char lastLaterTree = laterTree.charAt(laterTree.length() - 1);
        if (firstPreTree == lastLaterTree && preTree.charAt(1) == laterTree.charAt(laterTree.length() - 2)) {

            treeNode.setLeft(inTree(preTree.substring(1), laterTree.substring(0, laterTree.length()-1)));
            treeNode.setRight(inTree(preTree.substring(1), laterTree.substring(0, laterTree.length()-1)));

        } else {
            char secondPreTree = preTree.charAt(1);
            int indexValue = laterTree.indexOf(secondPreTree);
            treeNode.setLeft(inTree(preTree.substring(1, indexValue + 2), laterTree.substring(0, indexValue + 1)));
            treeNode.setRight(inTree(preTree.substring(indexValue + 2), laterTree.substring(indexValue + 1, laterTree.length() - 1)));
        }
        return treeNode;
    }

    public void inTreeOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        if(root.getLeft().equals(root.getRight())){

              root.setRight(null) ;


           }


    }

    public static void main(String[] args) {
        TreeCreate create = new TreeCreate();
//        TreeNode sampleTree = create.createSampleTree();
        TreeTraversal treeTraversal = new TreeTraversal();
//        treeTraversal.preOrder(sampleTree);
//        System.out.println();
//        treeTraversal.inOrder(sampleTree);
//        System.out.println();
//        treeTraversal.postOrder(sampleTree);
//
//        System.out.println("=========");
//
//        treeTraversal.postOrder(create.createTree("ABDEGCF", "DBGEACF"));
//        System.out.println("=========");
//        System.out.println(treeTraversal.postTree("ABDEGCF", "DBGEACF"));
//        System.out.println("=========");
       System.out.println(treeTraversal.count("ABDEGCF", "DGEBFCA"));
      //  System.out.println(treeTraversal.count("ABCd", "dCBA"));

        System.out.println(treeTraversal.inTree("abc", "cba"));

        //treeTraversal.inTreeOrder(treeTraversal.inTree("abc", "cba"));
    }
}
