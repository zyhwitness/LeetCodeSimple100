package simple100review3;

import org.junit.Test;
import simple100.LeetCode203;

/**
 * @Description: 移除链表元素 -review3
 * @Author: iWitness
 * @Date: 2025/4/24 18:02
 * @Version 1.0
 */
public class LeetCode203Review3 {

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        int val = 1;
        ListNode oldHead = head;
        while (oldHead != null) {
            System.out.println(oldHead.val);
            oldHead = oldHead.next;
        }
        System.out.println("----------------");
        ListNode newHead = removeElements(head, val);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        ListNode newHead = null;
        ListNode newLast = null;

        while (head != null) {
            if (head.val != val) {
                if (newHead == null) {
                    newHead = new ListNode(head.val);
                    newLast = newHead;
                } else {
                    newLast.next = new ListNode(head.val);
                    newLast = newLast.next;
                }

            }
            head = head.next;
        }

        return newHead;
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
