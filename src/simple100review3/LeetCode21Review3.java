package simple100review3;

import org.junit.Test;

/**
 * @Description: 合并两个有序链表 -review3
 * @Author: iWitness
 * @Date: 2025/4/29 11:37
 * @Version 1.0
 */
public class LeetCode21Review3 {

    @Test
    public void test() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(3, new ListNode(6, new ListNode(5)));
        ListNode listNode = mergeTwoLists2(l1, l2);

        while (listNode != null) {
            //取出构造函数里传入的数字
            int val = listNode.val;
            System.out.println(val);
            //取出构造函数里嵌套的下一个ListNode，进入下一次循环
            listNode = listNode.next;
        }

        //当不传入val时，val默认是0，next默认是null
        ListNode l3 = new ListNode();
        System.out.println(l3.val);

    }

    /**
     * 递归法
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode mergedList;
        if (list1.val <= list2.val) {
            mergedList = new ListNode(list1.val);
            mergedList.next = mergeTwoLists(list1.next, list2);
        } else {
            mergedList = new ListNode(list2.val);
            mergedList.next = mergeTwoLists(list1, list2.next);
        }

        return mergedList;
    }

    /**
     * 迭代法
     */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode nextNode = head;

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
        }
        if (list2 != null) {
            nextNode.next = list2;
        }

        return head.next;
    }

    /**
     * Definition for singly-linked list.
     * 从构造方法来看，为空、为一个数字，或者再嵌套一个ListNode
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
            //两个成员变量，val即为构造函数里传入的数字，next则为嵌套的另一个ListNode
            this.val = val;
            this.next = next;
        }
    }
}
