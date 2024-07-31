package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的前序遍历（中左右）
 * @Author: iWitness
 * @Date: 2024/7/31 23:08
 * @Version 1.0
 */
public class LeetCode144 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(4), new TreeNode(2)), new TreeNode(1));
        System.out.println(preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        nextNode(root, list);

        return list;

    }

    public void nextNode(TreeNode root, List<Integer> list) {

        list.add(root.val);

        if (root.left != null) {
            nextNode(root.left, list);
        }

        if (root.right != null) {
            nextNode(root.right, list);
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