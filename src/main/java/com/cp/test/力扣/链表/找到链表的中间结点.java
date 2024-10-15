package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;
/**
 * 可以使用快慢指针法，也称为龟兔赛跑算法。具体步骤如下：
 * 使用两个指针slow和fast同时指向链表的头部head。
 * 随后，fast指针每次移动两步，slow指针每次移动一步。
 * 当fast指针到达链表的末尾时，slow指针则到达了链表的中间。
 * 如果链表的节点数是偶数，则slow指针实际上指向了第二个中间节点。
 */
public class 找到链表的中间结点 {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}