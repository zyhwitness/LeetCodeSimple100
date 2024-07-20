package simple100;

import org.junit.Test;

/**
 * @Description: 将有序数组转换为二叉搜索树
 * @Author: iWitness
 * @Date: 2024/7/20 22:37
 * @Version 1.0
 */
public class LeetCode108 {

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(sortedArrayToBST(nums));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        return nextNode(left, right, nums);
    }

    public TreeNode nextNode(int left, int right, int[] nums) {
        if(left > right){
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = nextNode(left, mid - 1, nums);
        treeNode.right = nextNode(mid + 1, right, nums);
        return treeNode;
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
