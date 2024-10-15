package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/*
  给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */

/**
 * 在这个解决方案中，我们使用一个while循环遍历链表。
 * 当当前节点的值与下一个节点的值相等时，我们跳过下一个节点（即将当前节点的next指针指向下下一个节点），
 * 这样就相当于删除了重复的节点。
 * 如果当前节点的值与下一个节点的值不相等，则继续遍历下一个节点。
 * 最后返回处理过的链表头节点。
 */
public class 删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) { // 检查当前节点与下一个节点是否重复
                current.next = current.next.next; // 删除下一个节点
            } else {
                current = current.next;  // 继续向后移动指针
            }
        }

        return head;
    }

}