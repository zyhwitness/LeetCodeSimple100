package simple100review3;

import org.junit.Test;

/**
 * @Description: 二叉树的最小深度-review3
 * @Author: iWitness
 * @Date: 2025/4/14 11:47
 * @Version 1.0
 */
public class LeetCode111Review3 {

    @Test
    public void test() {
        //TreeNode root = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(minDepth(root));
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMin = minDepth(root.left);
        int rightMin = minDepth(root.right);

        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left != null && root.right != null) {
            return Math.min(leftMin, rightMin) + 1;
        } else {
            return Math.max(leftMin, rightMin) + 1;
        }
    }

    public int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMin = minDepth1(root.left);
        int rightMin = minDepth1(root.right);
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left != null && root.right != null) {
            return Math.min(leftMin, rightMin) + 1;
        } else {
            return Math.max(leftMin, rightMin) + 1;
        }
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
