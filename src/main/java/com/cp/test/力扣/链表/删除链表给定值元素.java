package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/*
  请编写一个函数，用于 删除单链表中特定数值的节点；
  函数的输入是单链表头节点，和一个数值，返回删除后的单链表头节点
 */

/**
 * 首先处理链表头节点，当头节点的值等于 val 时，通过循环将头节点向后移动，直到找到第一个值不等于 val 的节点，或者链表遍历结束。
 * 然后使用一个循环遍历链表，对于每一个节点，若下一个节点的值等于 val，则将当前节点的 next 指针指向下下一个节点，即跳过当前节点。
 * 如果当前节点的值不等于 val，则继续向后遍历。
 * 遍历完成后返回处理过的链表头节点。
 */
class 删除链表给定值元素 {
    public ListNode deleteNode(ListNode head, int val) {
        // 处理头节点
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;
        // 删除非头节点的特定数值节点
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}




