package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的所有路径 -review3
 * @Author: iWitness
 * @Date: 2025/4/22 15:18
 * @Version 1.0
 */
public class LeetCode257Review3 {

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right = new TreeNode(5, new TreeNode(6), new TreeNode(7));
        System.out.println(binaryTreePaths(root));
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        nextNode(list, sb, root);
        return list;
    }

    private void nextNode(List<String> list, StringBuilder sb, TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        sb.append("->").append(treeNode.val);

        if (treeNode.left == null && treeNode.right == null) {
            list.add(sb.substring(2));
            return;
        }
        // 第一轮：->1 传给左右分支分别去拼接；
        // 对于左边，第二轮：->1 ->2 再分别传给 2 的左右分支（3、4）
        // 对于左边，第三轮：->1 ->2 ->3 左边结束；->1 ->2 ->4 右边结束。
        // 对于右边，第二轮：->1 ->5 再分别传给 5 的左右分支（6、7）
        // 对于右边，第三轮：->1 ->5 ->6 左边结束；->1 ->5 ->7 右边结束。
        nextNode(list, new StringBuilder(sb), treeNode.left);
        nextNode(list, sb, treeNode.right);
        // 其实只要在上面用 new StringBuilder(sb)，下面就可以用 sb，目的就是在进行下一轮时对于左右边分别拼接；
        // 而如果上面用 sb，下面用 new StringBuilder(sb)，拼接右边时就会把左边的带上。
        // 当然最好是都用 new StringBuilder(sb)，这样更清晰表明，下一轮左右拼接都是基于上一轮的头。
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
