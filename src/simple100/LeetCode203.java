package simple100;

import org.junit.Test;

/**
 * @Description: 移除链表元素
 * @Author: iWitness
 * @Date: 2024/8/14 23:24
 * @Version 1.0
 */
public class LeetCode203 {

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
        /*while (head != null){
            System.out.println(head.val);
            head = head.next;
        }*/
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
