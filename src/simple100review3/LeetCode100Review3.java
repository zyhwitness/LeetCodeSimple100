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

        List<Integer> plist = new ArrayList<>();
        List<Integer> qlist = new ArrayList<>();

        nextNode(plist, p);
        nextNode(qlist, q);

        return plist.equals(qlist);
    }

    /**
     * 先看根节点，再看左右
     */
    private void nextNode(List<Integer> list, TreeNode treeNode) {

        list.add(treeNode.val);

        if (treeNode.left != null) {
            nextNode(list, treeNode.left);
        } else {
            list.add(null);
        }

        if (treeNode.right != null) {
            nextNode(list, treeNode.right);
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
