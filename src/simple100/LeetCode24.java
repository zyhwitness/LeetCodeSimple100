package simple100;

import org.junit.Test;

/**
 * @Description: 两两交换链表中的节点
 * @Author: iWitness
 * @Date: 2024/9/3 17:58
 * @Version 1.0
 */
public class LeetCode24 {

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode swapped = swapPairs(head);
        while (swapped != null) {
            System.out.println(swapped.val);
            swapped = swapped.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        //ahead 1 2 3 4 5
        ListNode ahead = new ListNode();
        ahead.next = head;
        //让当前节点先指向 ahead
        ListNode currNode = ahead;
        //currNode.next 为空说明节点数是偶数，currNode.next.next 为空说明节点数是奇数
        while (currNode.next != null && currNode.next.next != null) {
            //临时节点 1 指向 节点值为 1 的位置
            ListNode temp1 = currNode.next;
            //临时节点 2 指向 节点值为 3 的位置
            ListNode temp2 = currNode.next.next.next;
            //当前节点的下一个节点指向节点值为 2 的位置
            currNode.next = currNode.next.next;
            //当前节点的下下个节点指向临时节点 1（节点值为 1 的位置）
            currNode.next.next = temp1;
            //临时节点 1 的下一个节点指向临时节点 2
            temp1.next = temp2;
            //此时 ahead -> 2 -> 1 -> 3 - > 4 -> 5
            //再让当前节点指向节点值为 1 的位置（3 前面）
            currNode = currNode.next.next;
        }

        return ahead.next;
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
