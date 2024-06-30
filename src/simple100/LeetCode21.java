package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: 合并两个有序链表
 * @Author: iWitness
 * @Date: 2024/6/30 23:17
 * @Version 1.0
 */
public class LeetCode21 {

    @Test
    public void test() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode = mergeTwoLists(l1, l2);

        while (listNode != null) {
            int val = listNode.val;
            System.out.println(val);
            listNode = listNode.next;
        }

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //遍历两个ListNode，获取全部val存入list中
        List<Integer> arrayList = new ArrayList<>();
        while (list1 != null) {
            int val = list1.val;
            arrayList.add(val);
            list1 = list1.next;
        }
        while (list2 != null) {
            int val = list2.val;
            arrayList.add(val);
            list2 = list2.next;
        }

        //对arrayList中存入的元素进行排序
        Collections.sort(arrayList);

        //再遍历取出排序后的元素，存入一个新的ListNode中
        ListNode listNode = new ListNode();
        ListNode nextNode = listNode;
        for (Integer val : arrayList) {
            nextNode.next = new ListNode(val);
            nextNode = nextNode.next;
        }

        return listNode.next;

    }


    //Definition for singly-linked list.
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
