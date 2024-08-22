package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 反转链表
 * @Author: iWitness
 * @Date: 2024/8/22 22:48
 * @Version 1.0
 */
public class LeetCode206 {

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
            //每次循环取原链表节点元素时，新建一个链表，让它的下一个节点为反转链表
            ListNode listNode = new ListNode(head.val);
            listNode.next = reverse;
            //再赋值给反转链表
            reverse = listNode;

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
