package simple100review;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的中序遍历（左中右）-review
 * @Author: iWitness
 * @Date: 2024/8/1 17:28
 * @Version 1.0
 */
public class LeetCode94Review {

    @Test
    public void test() {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(4), new TreeNode(2)), new TreeNode(1));
        System.out.println(inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        nextNode(root, list);

        return list;
    }

    private void nextNode(TreeNode root, List<Integer> list) {

        if (root.left != null) {
            nextNode(root.left, list);
        }

        list.add(root.val);

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
