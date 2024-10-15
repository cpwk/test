package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/*
 * 若链表中的某个节点，既不是链表头节点，也不是链表尾节点，则称其为该链表的「中间节点」。
 * 假定已知链表的某一个中间节点，请实现一种算法，将该节点从链表中删除。
 * 例如，传入节点 c（位于单向链表 a->b->c->d->e->f 中），将其删除后，剩余链表为 a->b->d->e->f
 */

/**
 * 我们无法直接访问待删除节点的前一个节点，因此也无法使用常规的节点删除方法。
 * 但是可以采用另一种方法，即将下一个节点的值复制到当前节点中，并删除下一个节点。
 */
public class 删除中间节点 {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // 如果节点为空或者是尾节点，则无法删除
        }
        node.val = node.next.val; // 将当前节点的值替换为下一个节点的值
        node.next = node.next.next; // 将当前节点指向下一个节点的下一个节点
    }
}