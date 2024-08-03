package simple100review;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 对称二叉树-review
 * @Author: iWitness
 * @Date: 2024/8/3 15:23
 * @Version 1.0
 */
public class LeetCode101Review {

    @Test
    public void test() {

        TreeNode left = new TreeNode(4, new TreeNode(8), new TreeNode(3));
        TreeNode right = new TreeNode(4, new TreeNode(3), new TreeNode(8));
        TreeNode root = new TreeNode(5, left, right);
        System.out.println(isSymmetric(root));
    }

    /**
     * 将左右节点的值 val 分别添加到对应 list 中，最后比较 list 是否相等
     */
    public boolean isSymmetric(TreeNode root) {

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null && right == null) {
            return true;
        }

        if (left == null) {
            return false;
        }
        if (right == null) {
            return false;
        }

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        nextNode(left, leftList, 1);
        nextNode(right, rightList, 2);

        return leftList.equals(rightList);

    }

    private void nextNode(TreeNode root, List<Integer> list, int type) {

        list.add(root.val);

        //注意添加顺序，leftList 从左边开始，rightList 从右边开始
        if (type == 1) {
            if (root.left != null) {
                nextNode(root.left, list, 1);
            } else {
                list.add(null);
            }
            if (root.right != null) {
                nextNode(root.right, list, 2);
            } else {
                list.add(null);
            }
        } else {
            if (root.right != null) {
                nextNode(root.right, list, 2);
            } else {
                list.add(null);
            }
            if (root.left != null) {
                nextNode(root.left, list, 1);
            } else {
                list.add(null);
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
