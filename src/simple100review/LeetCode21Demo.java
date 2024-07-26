package simple100review;

import org.junit.Test;

/**
 * @Description: 向链表中依次添加节点元素
 * @Author: iWitness
 * @Date: 2024/7/25 23:58
 * @Version 1.0
 */
public class LeetCode21Demo {

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

    /**
     * listNode 和 nextNode 在初始时是相等的，都指向初始节点（对同一个对象的引用）
     * nextNode 在每次循环迭代中都会更新为新创建的节点
     * listNode 用于保持对链表头的引用，而 nextNode 用于在链表中插入新节点并移动到链表的末尾
     */
    @Test
    public void test() {

        ListNode listNode = new ListNode();
        ListNode nextNode = listNode;

        for (int i = 1; i < 5; i++) {
            nextNode.next = new ListNode(i);
            nextNode = nextNode.next;
        }

        while (listNode != null) {
            int val = listNode.val;
            System.out.println(val);
            listNode = listNode.next;
        }
    }
}
