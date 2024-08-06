package simple100;

import org.junit.Test;

/**
 * @Description: 相交链表
 * @Author: iWitness
 * @Date: 2024/8/6 18:36
 * @Version 1.0
 */
public class LeetCode160 {

    @Test
    public void test() {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);

        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);

        headA.next = list3;
        headB.next = list4;

        ListNode list5 = new ListNode(5);

        list3.next = list5;
        list4.next = list5;


        System.out.println(getIntersectionNode(headA, headB));

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA != null) {
            //每次内循环重新拷贝一个headB进行循环再比较
            ListNode headBCopy = headB;
            while (headBCopy != null) {
                //== 比较引用数据类型时比较的是地址而不是值
                if (headA == headBCopy) {
                    return headA;
                }
                headBCopy = headBCopy.next;
            }

            headA = headA.next;
        }

        return null;

    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

        ListNode headBCopy = headB;
        while (headA != null) {
            while (headB != null) {
                //== 比较引用数据类型时比较的是地址而不是值
                if (headA == headB) {
                    return headA;
                }
                headB = headB.next;
            }
            //headB 里层循环完变成空了，外层下一次循环前需要将其恢复成初始值
            headB = headBCopy;
            headA = headA.next;
        }

        return null;

    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
