package simple100review;

import org.junit.Test;

/**
 * @Description: 平衡二叉树-review
 * @Author: iWitness
 * @Date: 2024/8/2 18:51
 * @Version 1.0
 */
public class LeetCode110Review {

    @Test
    public void test() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
                new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));
        System.out.println(isBalanced(root));
    }

    /**
     * 平衡二叉树（AVL 树）是指“每个节点”的左右子树高度差的绝对值不超过 1
     */
    public boolean isBalanced(TreeNode root) {

        //若 < 0 说明不是平衡二叉树
        return height(root) >= 0;
    }

    private int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        //必须加上leftHeight、rightHeight >= 0 的条件，不然当某一节点左右高度差为 2 时，就会返回 -1 给上一层节点（此时已可判断此树不是平衡二叉树了）；
        //若此时这层节点的右边高度为 0 或者也是 -1，若不加 >= 0 的条件判断就会满足条件，从而导致返回一个正书给再上一层（而实际上一旦有一个节点不满足，最终就应该返回 -1 了）
        //或者不根据此方法最终返回的值来判断，比如设置个常量数组，一旦有一次返回 -1 了，就将数组值设为负数，最后判断这个数组的值是否大于 0
        if (leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight - rightHeight) <= 1) {
            return Math.max(leftHeight, rightHeight) + 1;
        } else {
            return -1;
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
