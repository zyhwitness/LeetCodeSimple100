package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 反转链表 -review3
 * @Author: iWitness
 * @Date: 2025/4/29 15:13
 * @Version 1.0
 */
public class LeetCode206Review3 {

    @Test
    public void test() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reverseNode = reverseList(headNode);
        while (reverseNode != null) {
            System.out.println(reverseNode.val);
            reverseNode = reverseNode.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = reverse;
            reverse = temp;
            head = head.next;
        }
        return reverse;
    }

    public ListNode reverseList2(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        ListNode reverse = new ListNode();
        ListNode nextNode = reverse;
        for (int i = list.size() - 1; i >= 0; i--) {
            nextNode.next = new ListNode(list.get(i));
            nextNode = nextNode.next;
        }

        return reverse.next;
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
