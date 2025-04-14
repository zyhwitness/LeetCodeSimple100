package simple100review3;

import org.junit.Test;

/**
 * @Description: 平衡二叉树-review3
 * @Author: iWitness
 * @Date: 2025/4/10 15:04
 * @Version 1.0
 */
public class LeetCode110Review3 {

    // 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
    // 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。

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

    private int maxDepth(TreeNode root, int[] result) {

        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth(root.left, result);
        int rightMax = maxDepth(root.right, result);

        if (leftMax - rightMax > 1 || rightMax - leftMax > 1) {
            result[0] = 1;
            return -1;
        }

        int max = Math.max(leftMax, rightMax);

        return max + 1;
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
