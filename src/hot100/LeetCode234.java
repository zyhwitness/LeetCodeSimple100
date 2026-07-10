package hot100;

import org.junit.Test;

/**
 * @Description: 回文链表
 * @Author: iWitness
 * @Date: 2026/7/10 12:03
 * @Version 1.0
 */
public class LeetCode234 {

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(1)));
        System.out.println(isPalindrome(head));
    }

    /**
     * 先反转链表，再和原链表的每个节点值进行比较
     */
    public boolean isPalindrome(ListNode head) {
        ListNode reverse = null;
        ListNode origin = head;

        while (head != null) {
            ListNode listNode = new ListNode(head.val);
            listNode.next = reverse;
            reverse = listNode;
            head = head.next;
        }

        while (origin != null && reverse != null) {
            if (origin.val != reverse.val) {
                return false;
            }
            origin = origin.next;
            reverse = reverse.next;
        }

        return true;

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
