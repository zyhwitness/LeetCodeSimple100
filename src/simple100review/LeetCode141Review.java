package simple100review;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 环形链表-review
 * @Author: iWitness
 * @Date: 2024/8/8 18:35
 * @Version 1.0
 */
public class LeetCode141Review {

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        //node4.next = node2;

        System.out.println(hasCycle(head));
    }

    /**
     * 快慢指针
     */
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
     * 利用 hashSet 的唯一性，将每个节点存入其中，判断是否已存在
     */
    public boolean hasCycle2(ListNode head) {

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.contains(head)) {
                set.add(head);
                head = head.next;
            } else {
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
