package simple100;

import org.junit.Test;

/**
 * @Description: 回文链表
 * @Author: iWitness
 * @Date: 2024/8/26 18:27
 * @Version 1.0
 */
public class LeetCode234 {

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(1)));
        System.out.println(isPalindrome(head));
    }

    /**
     * 先反转链表，再和原链表的每个节点值进行比较
     */
    public boolean isPalindrome(ListNode head) {
        ListNode headCopy = head;
        ListNode reverse = null;
        while (headCopy != null) {
            ListNode node = new ListNode(headCopy.val);
            node.next = reverse;
            reverse = node;
            headCopy = headCopy.next;
        }

        while (head != null && reverse != null) {
            if (reverse.val != head.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }

    /**
     * 先取出链表的每个节点值拼接成字符串，再对字符串取中间位置进行左右比较
     */
    public boolean isPalindrome2(ListNode head) {
        if (head == null) {
            return true;
        }

        String s = "";
        while (head != null) {
            s += head.val;
            head = head.next;
        }

        int index = s.length() / 2;
        for (int i = 0; i < index; i++) {
            char c = s.charAt(i);
            char c1 = s.charAt(s.length() - 1 - i);
            if (c != c1) {
                return false;
            }
        }

        return true;
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
