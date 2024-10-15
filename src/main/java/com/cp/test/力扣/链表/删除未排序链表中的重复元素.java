package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

import java.util.HashSet;
import java.util.Set;

/*
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 */

/**
 * 创建一个空的哈希集合（HashSet）或者哈希映射（HashMap），用于存储已经出现过的节点值。
 * 遍历链表的过程中，对于每一个节点：
 * 如果当前节点的值已经在哈希集合或哈希映射中出现过，说明这个节点是重复节点，可以直接删除。
 * 如果当前节点的值没有出现过，则将当前节点的值加入哈希集合或哈希映射中，继续遍历下一个节点。
 * 返回处理过的链表头节点。
 */
public class 删除未排序链表中的重复元素 {

    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next; // 删除重复节点
            } else {
                set.add(current.next.val);
                current = current.next;
            }
        }
        return dummy.next; // 返回除去头节点的链表
    }

    /**
     * 在这个解决方案中，我们首先检查链表头是否为空，然后使用两个指针current和runner分别指向链表头。
     * 我们使用两重循环来遍历链表，其中外层循环用于遍历每一个节点，内层循环用于检查并删除重复的节点。最终，未排序链表中的重复节点将被删除。
     */
    public void removeDuplicates(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            ListNode runner = current;
            while (runner.next != null) {
                if (runner.next.val == current.val) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

}