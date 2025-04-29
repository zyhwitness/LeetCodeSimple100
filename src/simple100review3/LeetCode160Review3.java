package simple100review3;

import org.junit.Test;

/**
 * @Description: 相交链表 -review3
 * @Author: iWitness
 * @Date: 2025/4/28 19:54
 * @Version 1.0
 */
public class LeetCode160Review3 {

    @Test
    public void test() {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);

        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);

        headA.next = list3;
        headB.next = list4;

        ListNode list5 = new ListNode(5);

        list3.next = list5;
        list4.next = list5;


        System.out.println(getIntersectionNode(headA, headB));

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA != null) {
            ListNode headBCopy = headB;
            while (headBCopy != null) {
                if (headA == headBCopy) {
                    return headA;
                }
                headBCopy = headBCopy.next;
            }
            headA = headA.next;
        }

        return null;

    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) {
            return null;
        }

        ListNode h1 = headA;
        ListNode h2 = headB;

        while (h1 != h2) {
            h1 = h1.next;
            h2 = h2.next;

            if (h1 == null && h2 == null) {
                return null;
            }
            if (h1 == null) {
                h1 = headB;
            }
            if (h2 == null) {
                h2 = headA;
            }
        }

        return h1;
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
