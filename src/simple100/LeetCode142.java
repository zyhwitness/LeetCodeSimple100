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

    /**
     * 利用快慢指针
     */
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                //在快慢指针相遇节点定义一个索引，头节点定义一个索引，同时向前走直到相遇，相遇位置即是环形链表入口
                ListNode index1 = fast;
                ListNode index2 = head;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }

        return null;
    }

    /**
     * 利用 hashSet 的唯一性，将每个节点存入其中，判断是否已存在
     */
    public ListNode detectCycle2(ListNode head) {

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
