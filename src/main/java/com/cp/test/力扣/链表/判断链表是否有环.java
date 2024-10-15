package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/*
  给你一个链表的头节点 head ，判断链表中是否有环。如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环
 */

/**
 * 要判断链表中是否有环，可以使用快慢指针法，也称为Floyd判圈算法。具体步骤如下：
 * 初始化两个指针slow和fast，初始时它们都指向链表的头节点。
 * 快指针每次移动两步，慢指针每次移动一步。
 * 如果存在环，则快慢指针最终会相遇；如果不存在环，则快指针会最先到达链表的末尾。
 */
public class 判断链表是否有环 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // 空链表或者单节点链表肯定没有环
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // 检查快慢指针是否相遇
                return true; // 存在环
            }
        }

        return false; // 不存在环
    }

}
