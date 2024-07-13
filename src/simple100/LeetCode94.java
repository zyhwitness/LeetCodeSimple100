package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的中序遍历（先左边、再中间、再右边）
 * @Author: iWitness
 * @Date: 2024/7/13 23:36
 * @Version 1.0
 */
public class LeetCode94 {


    @Test
    public void test() {

        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(4);
        TreeNode root = new TreeNode(5, left, right);
        inorderTraversal(root);
    }


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){
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
