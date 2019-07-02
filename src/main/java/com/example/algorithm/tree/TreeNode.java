package com.example.algorithm.tree;

import lombok.Data;
import lombok.Getter;

/**
 * Created by IDEA
 * author:wangzhou
 * Date:2019/4/1
 * Time:14:25
 **/

public class TreeNode {
    @Getter
    private final char value;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;

    public TreeNode(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
        if (this.left != null) {
            this.left.setParent(this);
        }

    }

    public void setRight(TreeNode right) {
        this.right = right;
        if (this.right != null) {
            this.right.setParent(this);
        }
    }

    private void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getParent() {
        return parent;
    }

    public TreeNode getRight() {
        return right;
    }
}
