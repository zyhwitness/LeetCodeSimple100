package simple100;

import org.junit.Test;

import java.util.HashSet;

/**
 * @Description: 环形链表
 * @Author: iWitness
 * @Date: 2024/7/31 12:19
 * @Version 1.0
 */
public class LeetCode141 {

    @Test
    public void test() {

        ListNode head1 = new ListNode(5);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(3);
        head1.next = head2;
        head2.next = head3;
        head3.next = head2;

        System.out.println(hasCycle(head1));

        //实际上如果是环形链表，循环永远不会走到头（因为没有），但不排除很长的单向链表。因此需要在循环里作判断
        //不管是用快慢指针判断是否会相遇，还是放入 hashSet 中判断是否已存在
    }

    /**
     * 快慢指针
     */
    public boolean hasCycle(ListNode head) {

        ListNode oneStep = head;
        ListNode twoStep = head;

        while (twoStep != null && twoStep.next != null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;

            if (oneStep == twoStep) {
                return true;
            }
        }

        return false;

    }

    /**
     * 利用 hashSet 的唯一性，将每个节点存入其中，判断是否已存在
     */
    public boolean hasCycle2(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        HashSet<ListNode> hashSet = new HashSet<>();

        while (head != null) {
            if (hashSet.contains(head)) {
                return true;
            }
            hashSet.add(head);
            head = head.next;
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
