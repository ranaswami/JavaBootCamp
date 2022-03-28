package com.rana.trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public static void main(String[] args) {

    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        dfs(root, postOrder);
        return postOrder;
    }
    static void dfs(TreeNode node, List<Integer> postOrder) {
        if (node == null)
            return;

        dfs(node.left, postOrder);
        dfs(node.right, postOrder);
        postOrder.add(node.val);
    }
}
