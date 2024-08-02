package simple100review;

import org.junit.Test;

/**
 * @Description: 二叉树的最小深度-review
 * @Author: iWitness
 * @Date: 2024/8/1 23:55
 * @Version 1.0
 */
public class LeetCode111Review {


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

        int miniLeft = minDepth(root.left);
        int miniRight = minDepth(root.right);

        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left != null && root.right != null) {
            return Math.min(miniLeft, miniRight) + 1;
        } else {
            return Math.max(miniLeft, miniRight) + 1;
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
