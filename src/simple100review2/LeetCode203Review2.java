package simple100review2;

import org.junit.Test;

/**
 * @Description: 移除链表元素-review2
 * @Author: iWitness
 * @Date: 2024/8/19 12:32
 * @Version 1.0
 */
public class LeetCode203Review2 {

    @Test
    public void test() {
        ListNode head = new ListNode(0);
        ListNode next1 = new ListNode(1);
        ListNode next2 = new ListNode(2);
        ListNode next3 = new ListNode(3);
        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        int val = 2;
        ListNode newHead = removeElements(head, val);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }

    }

    public ListNode removeElements(ListNode head, int val) {

        //实际上也是双指针
        ListNode newHead = new ListNode();
        ListNode nextNode = newHead;

        while (head != null) {
            //若不是要移除的元素，则加到新的链表里
            if (head.val != val) {
                nextNode.next = new ListNode(head.val);
                nextNode = nextNode.next;
            }

            head = head.next;
        }

        return newHead.next;
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
