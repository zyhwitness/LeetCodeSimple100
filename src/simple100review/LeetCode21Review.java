package simple100review;

import org.junit.Test;

/**
 * @Description: 合并两个有序链表-review
 * @Author: iWitness
 * @Date: 2024/7/25 18:03
 * @Version 1.0
 */
public class LeetCode21Review {

    @Test
    public void test() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode l2 = new ListNode(3, new ListNode(6));
        ListNode listNode = mergeTwoLists2(l1, l2);

        while (listNode != null) {
            //取出构造函数里传入的数字
            int val = listNode.val;
            System.out.println(val);
            //取出构造函数里嵌套的下一个ListNode，进入下一次循环
            listNode = listNode.next;
        }

    }

    /**
     * 递归法
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode mergedList;
        if (l1.val <= l2.val) {
            mergedList = new ListNode(l1.val);
            mergedList.next = mergeTwoLists(l1.next, l2);
        } else {
            mergedList = new ListNode(l2.val);
            mergedList.next = mergeTwoLists(l1, l2.next);
        }
        return mergedList;
    }

    /**
     * 迭代法
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        //1,2,5; 3,6
        ListNode node = new ListNode();
        ListNode nextNode = node;
        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val){
                nextNode.next = l1;
                l1 = l1.next;
            }else {
                nextNode.next = l2;
                l2 = l2.next;
            }
            nextNode = nextNode.next;
        }

        if(l1 != null){
            nextNode.next = l1;
        }else {
            nextNode.next = l2;
        }

        return node.next;
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
