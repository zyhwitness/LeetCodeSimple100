package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的后序遍历（左右中）-review3
 * @Author: iWitness
 * @Date: 2025/4/16 16:09
 * @Version 1.0
 */
public class LeetCode145Review3 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(4), new TreeNode(2)), new TreeNode(1));
        System.out.println(postorderTraversal(root));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
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
        if (root.right != null) {
            nextNode(root.right, list);
        }

        list.add(root.val);

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
