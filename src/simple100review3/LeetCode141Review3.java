package simple100review3;

import org.junit.Test;

/**
 * @Description: 环形链表 -review3
 * @Author: iWitness
 * @Date: 2025/4/24 17:40
 * @Version 1.0
 */
public class LeetCode141Review3 {

    @Test
    public void test() {

        ListNode head1 = new ListNode(5);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(3);
        head1.next = head2;
        head2.next = head3;
        head3.next = head2;

        System.out.println(hasCycle(head1));

    }

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;

    }


    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
