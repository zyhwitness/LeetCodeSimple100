package simple100;

import org.junit.Test;

/**
 * @Description: 删除排序链表中的重复元素
 * @Author: iWitness
 * @Date: 2024/7/12 23:13
 * @Version 1.0
 */
public class LeetCode83 {

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.println(deleteDuplicates(head));

        while (head != null) {
            int val = head.val;
            System.out.println(val);
            head = head.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        //为什么要赋值给新的 node？
        ListNode node = head;
        while (node.next != null) {
            Integer val = node.val;
            Integer nextVal = node.next.val;
            if (val.equals(nextVal)) {
                //若相等，则将后一节点前移
                node.next = node.next.next;
            } else {
                //若不相等，则往后看下一节点
                node = node.next;
            }
        }
        return head;
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
