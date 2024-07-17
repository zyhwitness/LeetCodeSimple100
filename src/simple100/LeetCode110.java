package simple100;

import org.junit.Test;

/**
 * @Description: 平衡二叉树
 * @Author: iWitness
 * @Date: 2024/7/17 23:34
 * @Version 1.0
 */
public class LeetCode110 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(4), null), null);
        System.out.println(isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {

        int[] result = {0};

        maxDepth(root, result);

        return result[0] == 0;
    }

    public int maxDepth(TreeNode root, int[] result) {

        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth(root.left, result);
        int rightMax = maxDepth(root.right, result);

        if (leftMax - rightMax > 1 || rightMax - leftMax > 1) {
            result[0] = 1;
            return -1;
        }

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
