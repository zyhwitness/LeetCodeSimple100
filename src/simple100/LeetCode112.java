package simple100;

import org.junit.Test;

/**
 * @Description: 路径总和
 * @Author: iWitness
 * @Date: 2024/7/22 19:08
 * @Version 1.0
 */
public class LeetCode112 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(3, new TreeNode(4), new TreeNode(20, null, new TreeNode(7)));
        System.out.println(hasPathSum(root, 7));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        int[] nums = {0};
        nextNode(root, targetSum, 0, nums);
        return nums[0] == 1;

    }

    public void nextNode(TreeNode root, int targetSum, int sum, int[] nums) {

        if (root == null) {
            return;
        }
        sum += root.val;
        nextNode(root.left, targetSum, sum, nums);
        nextNode(root.right, targetSum, sum, nums);

        if (root.left == null && root.right == null) {
            System.out.println(root.val);

            if (sum == targetSum) {
                nums[0] = 1;
            }
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
