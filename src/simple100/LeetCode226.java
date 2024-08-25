package simple100;

import org.junit.Test;

/**
 * @Description: 翻转二叉树
 * @Author: iWitness
 * @Date: 2024/8/25 11:16
 * @Version 1.0
 */
public class LeetCode226 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode invertTree = invertTree(root);

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode tempTree = root.left;
        root.left = root.right;
        root.right = tempTree;

        System.out.println(root.val);

        invertTree(root.left);
        invertTree(root.right);

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
