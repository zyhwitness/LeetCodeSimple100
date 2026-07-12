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
        ListNode listNode = mergeTwoLists(l1, l2);

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
