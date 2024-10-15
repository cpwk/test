package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/**
 * 首先判断两个链表headA和headB是否为空，如果其中一个为空，直接返回null，因为至少有一个链表为空，那么它们肯定不会有交点。
 * 定义两个指针pA和pB分别指向链表headA和headB的头节点。
 * 使用一个循环来遍历链表，每一步迭代中，将pA和pB同时向后移动一个节点。
 * 如果pA和pB指向的节点相同，则说明找到了两个链表的交点，直接返回该节点。
 * 如果pA和pB有一个为空了，则将其指向对方的链表头，继续向后移动。
 * 当pA和pB都为空，或者pA和pB指向相同的节点时，循环结束，返回其指向的节点。
 */
public class 找到链表相交节点 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
    }

}