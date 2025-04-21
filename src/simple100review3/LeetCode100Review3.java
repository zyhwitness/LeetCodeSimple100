package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 相同的树 -review3
 * @Author: iWitness
 * @Date: 2025/4/21 17:25
 * @Version 1.0
 */
public class LeetCode100Review3 {

    @Test
    public void test() {

        TreeNode p = new TreeNode(4, new TreeNode(8), null);
        TreeNode q = new TreeNode(4, null, new TreeNode(8));
        System.out.println(isSameTree(p, q));

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();
        nextNode(p, pList);
        nextNode(q, qList);

        return pList.equals(qList);

    }

    /**
     * 先看根节点，再看左右
     */
    public void nextNode(TreeNode root, List<Integer> list) {
        list.add(root.val);

        if (root.left != null) {
            nextNode(root.left, list);
        } else {
            list.add(null);
        }

        if (root.right != null) {
            nextNode(root.right, list);
        } else {
            list.add(null);
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
