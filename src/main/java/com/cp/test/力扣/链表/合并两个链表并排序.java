package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/*
  将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */

/**
 * 在这个解决方案中，我们首先检查l1和l2是否为空，
 * 如果其中一个为空，则直接返回另一个链表。
 * 否则，我们创建一个dummy节点来作为新链表的头结点，然后使用current指针来追踪新链表的结尾。
 * 然后我们使用循环遍历l1和l2，将较小的节点接在current节点后面，然后将current移动到新节点后。
 * 最后，当l1或l2其中一个遍历结束后，我们将剩下的节点直接接在current节点后。最终返回合并后的链表头节点。
 */
public class 合并两个链表并排序 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }
}