package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的所有路径
 * @Author: iWitness
 * @Date: 2024/8/28 22:18
 * @Version 1.0
 */
public class LeetCode257 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right = new TreeNode(5);
        System.out.println(binaryTreePaths(root));
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> resultList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        nextNode(root, resultList, sb);
        return resultList;
    }

    private void nextNode(TreeNode treeNode, List<String> list, StringBuilder sb) {
        if (treeNode == null) {
            return;
        }

        //每次递归时拼接当前节点的 val
        sb.append("->").append(treeNode.val);

        //当递归到叶子节点时，将拼接的 sb 添加到 list 中
        if (treeNode.left == null && treeNode.right == null) {
            list.add(sb.substring(2));
        }

        //下次递归时注意要 new StringBuilder(sb)
        nextNode(treeNode.left, list, new StringBuilder(sb));
        nextNode(treeNode.right, list, new StringBuilder(sb));
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
