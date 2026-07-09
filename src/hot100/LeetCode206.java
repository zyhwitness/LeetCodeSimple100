package hot100;

import org.junit.Test;

/**
 * @Description: 反转链表
 * @Author: iWitness
 * @Date: 2026/7/9 17:00
 * @Version 1.0
 */
public class LeetCode206 {

    @Test
    public void test() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reverseNode = reverseList(headNode);
        while (reverseNode != null) {
            System.out.println(reverseNode.val);
            reverseNode = reverseNode.next;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode reverse = null;
        while (head != null) {
            // 循环取原链表节点元素时，新建一个链表，让它的下一个节点为最终的反转链表
            ListNode listNode = new ListNode(head.val);
            listNode.next = reverse;
            reverse = listNode;
            head = head.next;
        }

        return reverse;
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
