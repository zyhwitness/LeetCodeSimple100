package simple100review2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的前序遍历（中左右）-review2
 * @Author: iWitness
 * @Date: 2024/8/25 16:30
 * @Version 1.0
 */
public class LeetCode144Review2 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(4), new TreeNode(2)), new TreeNode(1));
        System.out.println(preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }
        nextNode(root, list);
        return list;
    }

    private void nextNode(TreeNode treeNode, List<Integer> list) {

        list.add(treeNode.val);

        if (treeNode.left != null) {
            nextNode(treeNode.left, list);
        }
        if (treeNode.right != null) {
            nextNode(treeNode.right, list);
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
