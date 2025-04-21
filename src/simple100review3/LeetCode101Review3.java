package simple100review3;

import org.junit.Test;

/**
 * @Description: 对称二叉树-review3
 * @Author: iWitness
 * @Date: 2025/4/10 12:04
 * @Version 1.0
 */
public class LeetCode101Review3 {

    @Test
    public void test() {

        TreeNode left = new TreeNode(4, new TreeNode(8), null);
        TreeNode right = new TreeNode(4, new TreeNode(8), null);
        TreeNode root = new TreeNode(5, left, right);
        System.out.println(checkSymmetricTree(root));
    }

    public boolean checkSymmetricTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        // 都为空，说明是对称的
        if (left == null && right == null) return true;
        // 只有一个为空，不对称
        if (left == null || right == null) return false;
        // 值不同，不对称
        if (left.val != right.val) return false;
        // 继续比较子节点（左节点的左节点 和 右节点的右节点、左节点的右节点 和 右节点的左节点 比较）
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    private boolean isMirror1(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isMirror1(left.left, right.right) && isMirror1(left.right, right.left);
    }

    private boolean isMirror2(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }
        return isMirror2(left.left, right.right) && isMirror2(left.right, right.left);
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
