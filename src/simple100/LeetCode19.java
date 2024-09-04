package simple100;

import org.junit.Test;

/**
 * @Description: 删除链表的倒数第 N 个结点
 * @Author: iWitness
 * @Date: 2024/9/4 18:27
 * @Version 1.0
 */
public class LeetCode19 {

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode removed = removeNthFromEnd(head, 3);
        while (removed != null) {
            System.out.println(removed.val);
            removed = removed.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //定义一个 ahead 的节点放在最前面，指向 head（ahead 1 2 3 4）
        ListNode ahead = new ListNode();
        ahead.next = head;
        //定义快慢指针，开始都指向 ahead
        ListNode fast = ahead;
        ListNode slow = ahead;

        //先让快指针往前走 n+1 步
        n++;
        while (n > 0 && fast != null) {
            fast = fast.next;
            n--;
        }

        //再让快慢指针同时走，这样快指针走到末尾时，慢指针正好走到要移除节点前一位（ahead 1 2 3 4 null，此时快指针在 null，慢指针在 1）
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //此时让慢指针的下一位跳过要移除节点，到下下位
        slow.next = slow.next.next;

        return ahead.next;
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
