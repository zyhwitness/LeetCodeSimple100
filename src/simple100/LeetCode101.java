package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 对称二叉树
 * @Author: iWitness
 * @Date: 2024/7/15 23:21
 * @Version 1.0
 */
public class LeetCode101 {

    @Test
    public void test() {

        TreeNode left = new TreeNode(4, new TreeNode(8), null);
        TreeNode right = new TreeNode(4, null, new TreeNode(8));
        TreeNode root = new TreeNode(5, left, right);
        System.out.println(isSymmetric(root));
    }

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

        List<Integer> listLeft = new ArrayList<>();
        List<Integer> listRight = new ArrayList<>();

        nextNode(left, listLeft, 1);
        nextNode(right, listRight, 2);

        return listLeft.equals(listRight);
    }

    /**
     * 根据类型不同往 list 中添加顺序不一样
     */
    public void nextNode(TreeNode root, List<Integer> list, int type) {

        list.add(root.val);

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
