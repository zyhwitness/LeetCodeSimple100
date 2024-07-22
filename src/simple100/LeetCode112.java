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
        //TreeNode root = new TreeNode(3, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        System.out.println(hasPathSum(root, 3));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        //nums[0] = 0 返回 false；nums[0] = 1 返回 true
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

        //若左右子节点都为空，则代表是叶子节点
        if (root.left == null && root.right == null) {
            System.out.println(root.val);
            //此时的 sum 为根节点到叶子节点的和
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
