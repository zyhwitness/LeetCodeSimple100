package simple100review;

import org.junit.Test;

/**
 * @Description: 反转链表-review
 * @Author: iWitness
 * @Date: 2024/9/3 18:09
 * @Version 1.0
 */
public class LeetCode206Review {

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reversed = reverseList(head);
        while (reversed != null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode reversed = null;
        while (head != null) {
            ListNode listNode = new ListNode(head.val);
            listNode.next = reversed;
            reversed = listNode;
            head = head.next;
        }
        return reversed;
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
