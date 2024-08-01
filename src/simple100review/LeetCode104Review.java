package simple100review;

import org.junit.Test;

/**
 * @Description: 二叉树的最大深度-review
 * @Author: iWitness
 * @Date: 2024/8/1 17:40
 * @Version 1.0
 */
public class LeetCode104Review {

    @Test
    public void test() {
        TreeNode root = new TreeNode(5);
        System.out.println(maxDepth(root));
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        //遍历到叶子节点（不再有左右节点）时，高度需要 + 1（算上本层的），比如就一个根节点
        return Math.max(leftMax, rightMax) + 1;

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
