package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/**
 * 初始化三个指针prev、current和next，分别表示前一个节点、当前节点和下一个节点。
 * 最开始prev指向null，current指向链表的头节点。
 * 在循环中，首先先将next指针指向current的下一个节点，以备后用。
 * 然后将current的next指针指向prev，实现链表节点的反转。
 * 最后，分别向后移动prev、current和next指针，将当前节点的next指针指向前一个节点。
 * 遍历完整个链表后，prev指向了原链表的最后一个节点，即反转后的链表的头节点。
 */

public class 转换链表为倒序 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode nextTemp = cur.next;

            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }

        return pre;
    }
}

