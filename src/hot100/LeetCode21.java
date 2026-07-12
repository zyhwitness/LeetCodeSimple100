package hot100;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 合并两个有序链表
 * @Author: iWitness
 * @Date: 2026/7/10 17:53
 * @Version 1.0
 */
public class LeetCode21 {

    @Test
    public void test() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(3, new ListNode(6, new ListNode(5)));
        ListNode listNode = mergeTwoLists1(l1, l2);

        while (listNode != null) {
            //取出构造函数里传入的数字
            int val = listNode.val;
            System.out.println(val);
            //取出构造函数里嵌套的下一个ListNode，进入下一次循环
            listNode = listNode.next;
        }

    }

    /**
     * 遍历放入list中排序再转成链表
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list);

        ListNode merged = new ListNode();
        ListNode next = merged;

        for (Integer i : list) {
            next.next = new ListNode(i);
            next = next.next;
        }

        return merged.next;
    }

    /**
     * 双指针，一个指向头节点，另一个向后移动
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode next = merged;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                next.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                next.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            next = next.next;
        }

        if (list1 != null) {
            next.next = list1;
        } else {
            next.next = list2;
        }

        return merged.next;
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
