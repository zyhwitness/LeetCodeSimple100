package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的中序遍历（从根节点开始每个节点先看左边、再中间即自己、再右边）
 * @Author: iWitness
 * @Date: 2024/7/13 23:36
 * @Version 1.0
 */
public class LeetCode94 {

    @Test
    public void test() {

        TreeNode left = new TreeNode(3, new TreeNode(7), new TreeNode(9));
        TreeNode right = new TreeNode(4, null, new TreeNode(8));
        TreeNode root = new TreeNode(5, left, right);
        System.out.println(inorderTraversal(root));

        // 结果 [7, 3, 9, 5, 4, 8]，从根节点先看左边 left 节点，left 节点左边还有节点值为 7，右边还有节点值为 9，因此 7 -> 3 -> 9；
        // 再到根节点，再看右边 right 节点，right 节点只有右节点值为 8，因此 5 -> 4 -> 8
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        nextNode(root, list);

        return list;
    }

    /**
     * 递归算法，先看根节点左边是否还有节点，若没有则添加节点值到 list，再看右边是否还有节点
     */
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
