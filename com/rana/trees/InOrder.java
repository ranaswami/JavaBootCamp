package com.rana.trees;
//https://leetcode.com/problems/binary-tree-inorder-traversal/
import java.util.ArrayList;
import java.util.List;

public class InOrder {
    public static void main(String[] args) {

    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        dfs(root, inOrder);
        return inOrder;
    }
    static void dfs(TreeNode node, List<Integer> inOrder) {
        if (node == null)
            return;

        dfs(node.left, inOrder);
        inOrder.add(node.val);
        dfs(node.right, inOrder);
    }
}
