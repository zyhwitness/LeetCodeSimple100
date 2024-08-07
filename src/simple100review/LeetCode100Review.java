package simple100review;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 相同的树-review
 * @Author: iWitness
 * @Date: 2024/8/7 19:08
 * @Version 1.0
 */
public class LeetCode100Review {

    @Test
    public void test() {

        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
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

        System.out.println(pList);
        System.out.println(qList);

        return pList.equals(qList);

    }

    public void nextNode(TreeNode treeNode, List<Integer> list) {

        list.add(treeNode.val);

        if (treeNode.left != null) {
            nextNode(treeNode.left, list);
        } else {
            list.add(null);
        }
        if (treeNode.right != null) {
            nextNode(treeNode.right, list);
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
