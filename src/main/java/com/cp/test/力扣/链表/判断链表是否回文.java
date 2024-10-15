package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/*
  给你一个单链表的头节点 head ，请你判断该链表是否为
  判断链表是否回文
  如果是，返回 true ；否则，返回 false
 */

/**
 * 在这个解决方案中，我们首先使用快慢指针找到链表的中间节点，
 * 然后反转链表的后半部分，
 * 最后比较链表的前半部分和反转后的后半部分。
 * 如果链表是回文的，那么比较过程中应该每个节点的值都是相同的；
 * 如果链表不是回文的，那么比较过程中会有节点的值不相同。
 */
public class 判断链表是否回文 {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // 空链表或者单节点链表都是回文链表
        }

        // 找到链表的中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 反转后半部分链表
        ListNode prev = null;
        ListNode curr = slow.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 比较前半部分和反转后的后半部分
        ListNode p1 = head;
        ListNode p2 = prev;
        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

}