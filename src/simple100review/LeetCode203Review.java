package simple100review;

import org.junit.Test;

/**
 * @Description: 移除链表元素-review
 * @Author: iWitness
 * @Date: 2024/8/17 22:49
 * @Version 1.0
 */
public class LeetCode203Review {

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
        ListNode newHead = null;
        ListNode nextNode = null;

        while (head != null) {
            //若不是要移除的元素，则加到新的链表里
            if (head.val != val) {
                //加第一个元素的时候，newHead 和 nextNode 都指向链表头节点；
                //之后再加元素，会创建新的节点并将其赋值给 nextNode.next，然后将 nextNode 移动到它的下一个节点；
                //因此 nextNode 会一直向下一个节点移动，而 newHead 则一直指向头节点（但链表本身是在向后延伸的）
                if (newHead == null) {
                    newHead = new ListNode(head.val);
                    nextNode = newHead;
                } else {
                    nextNode.next = new ListNode(head.val);
                    nextNode = nextNode.next;
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
