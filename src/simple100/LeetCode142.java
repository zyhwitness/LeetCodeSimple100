package simple100;

import org.junit.Test;

import java.util.HashSet;

/**
 * @Description: 环形链表 II
 * @Author: iWitness
 * @Date: 2024/9/5 23:24
 * @Version 1.0
 */
public class LeetCode142 {

    @Test
    public void test() {
        ListNode head = new ListNode(3);
        ListNode nextNode1 = new ListNode(2);
        ListNode nextNode2 = new ListNode(0);
        ListNode nextNode3 = new ListNode(-4);
        head.next = nextNode1;
        nextNode1.next = nextNode2;
        nextNode2.next = nextNode3;
        nextNode3.next = nextNode1;
        ListNode detected = detectCycle(head);
        System.out.println(detected.val);
    }

    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) {
                return head;
            }
            hashSet.add(head);
            head = head.next;
        }

        return null;
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
