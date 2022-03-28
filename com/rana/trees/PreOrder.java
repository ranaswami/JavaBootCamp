package com.rana.trees;
//https://leetcode.com/problems/binary-tree-preorder-traversal/
import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public static void main(String[] args) {

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        dfs(root, preOrder);
        return preOrder;
    }
    static void dfs(TreeNode node, List<Integer> preOrder) {
        if (node == null)
            return;
        preOrder.add(node.val);
        dfs(node.left, preOrder);
        dfs(node.right, preOrder);
    }

}
