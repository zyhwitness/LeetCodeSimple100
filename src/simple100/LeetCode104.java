package simple100;

import org.junit.Test;

/**
 * @Description: 二叉树的最大深度
 * @Author: iWitness
 * @Date: 2024/7/16 23:33
 * @Version 1.0
 */
public class LeetCode104 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(4), null), null);
        System.out.println(maxDepth(root));
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        int maxDepth = Math.max(leftMax, rightMax);

        return maxDepth + 1;

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
