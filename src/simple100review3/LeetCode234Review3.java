package simple100review3;

import org.junit.Test;

/**
 * @Description: 回文链表 -review3
 * @Author: iWitness
 * @Date: 2025/4/29 15:36
 * @Version 1.0
 */
public class LeetCode234Review3 {

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(1)));
        System.out.println(isPalindrome(head));
    }

    /**
     * 先反转链表，再和原链表的每个节点值进行比较
     */
    public boolean isPalindrome(ListNode head) {
        ListNode headCopy = head;
        ListNode reverse = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = reverse;
            reverse = temp;
            head = head.next;
        }

        while (headCopy != null && reverse != null) {
            if (headCopy.val != reverse.val) {
                return false;
            }
            headCopy = headCopy.next;
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
