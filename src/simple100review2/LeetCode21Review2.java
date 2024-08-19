package simple100review2;

import org.junit.Test;

/**
 * @Description: 合并两个有序链表-review2
 * @Author: iWitness
 * @Date: 2024/8/18 16:52
 * @Version 1.0
 */
public class LeetCode21Review2 {

    @Test
    public void test() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode list2 = new ListNode(4, new ListNode(6));
        ListNode mergedList = mergeTwoLists2(list1, list2);
        while (mergedList != null) {
            System.out.println(mergedList.val);
            mergedList = mergedList.next;
        }
    }

    /**
     * 迭代法
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode headNode = new ListNode();
        ListNode nextNode = headNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                nextNode.next = list1;
                list1 = list1.next;
            } else {
                nextNode.next = list2;
                list2 = list2.next;
            }
            nextNode = nextNode.next;
        }

        if (list1 != null) {
            nextNode.next = list1;
        } else {
            nextNode.next = list2;
        }

        return headNode.next;
    }

    /**
     * 递归法
     */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;

        if (list2 == null) return list1;

        ListNode mergedList;
        if (list1.val <= list2.val) {
            mergedList = new ListNode(list1.val);
            mergedList.next = mergeTwoLists2(list1.next, list2);
        } else {
            mergedList = new ListNode(list2.val);
            mergedList.next = mergeTwoLists2(list1, list2.next);
        }

        return mergedList;
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
