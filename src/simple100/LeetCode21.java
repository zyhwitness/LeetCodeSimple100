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
        //遍历两个ListNode，获取全部val存入list中
        List<Integer> arrayList = new ArrayList<>();
        while (list1 != null) {
            //取出构造函数里传入的数字添加到ArrayList
            int val = list1.val;
            arrayList.add(val);
            //取出构造函数里嵌套的下一个ListNode，进入下一次循环
            list1 = list1.next;
        }
        while (list2 != null) {
            //取出构造函数里传入的数字添加到ArrayList
            int val = list2.val;
            arrayList.add(val);
            //取出构造函数里嵌套的下一个ListNode，进入下一次循环
            list2 = list2.next;
        }

        //对ArrayList中存入的数字进行排序
        Collections.sort(arrayList);

        //再遍历取出排序后的数字，嵌套存入一个新的ListNode中
        //1 2 3 4
        //new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))))

        //listNode 和 nextNode 在初始时是相等的，都指向初始节点
        ListNode listNode = new ListNode();
        ListNode nextNode = listNode;

        for (Integer val : arrayList) {

            //nextNode 在每次循环迭代中都会更新为新创建的节点
            nextNode.next = new ListNode(val);
            nextNode = nextNode.next;
        }

        //listNode 用于保持对链表头的引用，而 nextNode 用于在链表中插入新节点并移动到链表的末尾
        return listNode.next;

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
