package simple100review;

import org.junit.Test;

/**
 * @Description: 相交链表-review
 * @Author: iWitness
 * @Date: 2024/8/18 12:12
 * @Version 1.0
 */
public class LeetCode160Review {

    @Test
    public void test() {

        ListNode headA = new ListNode(3);
        ListNode headB = new ListNode(2);
        ListNode nextB = new ListNode(4);
        ListNode next1 = new ListNode(5);
        ListNode next2 = new ListNode(6);
        ListNode next3 = new ListNode(7);
        headA.next = next1;
        headB.next = nextB;
        nextB.next = next1;
        next1.next = next2;
        next2.next = next3;
        ListNode intersectionNode = getIntersectionNode2(headA, headB);
        while (intersectionNode != null) {
            System.out.println(intersectionNode.val);
            intersectionNode = intersectionNode.next;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA != null) {
            //内部循环 headB 的时候，不能直接用 headB 本身，因为不像集合的遍历不改变集合本身，链表每次循环都指向下一个节点
            //因此当进入下一次内部循环时，应当从头节点重新开始。所以每次内部循环可以新建立一个 headB 的拷贝
            ListNode headBCopy = headB;
            while (headBCopy != null) {
                //比较的是地址而不是节点上的元素值，因此用 ==（用 equals 也可以，因为没有重写，Object 超类中也是比较地址）
                if (headA.equals(headBCopy)) {
                    return headA;
                }
                headBCopy = headBCopy.next;
            }
            headA = headA.next;
        }

        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        //A —> (3,5,6,7) B —> (2,4,5,6,7)
        ListNode h1 = headA, h2 = headB;

        //若 AB 长度一致，则直接同时向后移动指针，找出相等的节点地址；
        //若 AB 长度不一致，则同时开始长度短的先移动到最后，那么接着让它从另一个链表头开始移动...直到移动到某一节点时长度相等
        while (h1 != h2) {
            h1 = h1.next;
            h2 = h2.next;

            if (h1 == null && h2 == null) return null;
            if (h1 == null) h1 = headB;
            if (h2 == null) h2 = headA;
        }

        return h1;
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
