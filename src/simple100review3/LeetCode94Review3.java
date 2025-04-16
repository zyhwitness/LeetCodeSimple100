package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的中序遍历（左中右）-review3
 * @Author: iWitness
 * @Date: 2025/4/16 16:21
 * @Version 1.0
 */
public class LeetCode94Review3 {

    @Test
    public void test() {

        TreeNode left = new TreeNode(3, new TreeNode(7), new TreeNode(9));
        TreeNode right = new TreeNode(4, null, new TreeNode(8));
        TreeNode root = new TreeNode(5, left, right);
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

    public void nextNode(TreeNode root, List<Integer> list) {

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
