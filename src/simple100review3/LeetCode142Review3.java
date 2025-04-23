package simple100review3;

import org.junit.Test;

import java.util.HashSet;

/**
 * @Description: 环形链表 II -review3
 * @Author: iWitness
 * @Date: 2025/4/23 18:01
 * @Version 1.0
 */
public class LeetCode142Review3 {

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

    private ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }

        return null;
    }

    private ListNode detectCycle1(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode index1 = head;
                ListNode index2 = fast;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }

        // 快慢指针，当相遇时，在相遇节点定义一个索引，在头节点定义一个索引，同时向前走，相遇位置即为环形入口。
//        设：
//
//        L：头节点到环入口的距离。
//        C：环的长度。
//        X：相遇点距离环入口的距离。
//        从头走到相遇点：
//
//        slow 走了 L + X
//        fast 走了 L + X + n*C（比 slow 多走了整环若干圈）

//        fast 走的是 slow 的两倍
//        2 * (L + X) = L + X + n * C
//        L + X = n * C
//        L = n * C - X


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
