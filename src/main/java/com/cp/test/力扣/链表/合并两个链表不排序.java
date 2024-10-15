package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */

/**
 * 首先判断l1是否为空，如果l1为空，则直接返回l2作为合并后的链表。
 * 如果l1不为空，从l1的头部开始遍历，直到找到链表l1的尾部节点.
 * 将链表l2连接到链表l1的尾部, 使得l1和l2成为一个新的合并后的链表.
 * 返回合并后的链表l1.
 */
public class 合并两个链表不排序 {

    public ListNode mergeLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = l2;

        return l1;
    }

}