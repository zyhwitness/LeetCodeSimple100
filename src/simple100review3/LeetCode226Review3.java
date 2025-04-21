package simple100review3;

import org.junit.Test;

/**
 * @Description: 翻转二叉树 -review3
 * @Author: iWitness
 * @Date: 2025/4/21 18:15
 * @Version 1.0
 */
public class LeetCode226Review3 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode flipTree = flipTree(root);

    }

    public TreeNode flipTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        flipTree(root.left);
        flipTree(root.right);

        return root;
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
