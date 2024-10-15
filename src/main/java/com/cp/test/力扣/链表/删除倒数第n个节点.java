/*
 * Ant Group
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/**
 * 使用两个指针，一个快指针和一个慢指针，初始时都指向链表的头节点。
 * 先移动快指针，使其移动到第n个节点的位置。
 * 再同时移动快慢指针，直到快指针到达链表的末尾。
 * 此时慢指针指向要删除节点的前一个节点。
 * 通过调整指针的指向，完成删除操作。
 */
public class 删除倒数第n个节点 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

}