package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/*
  实现一种算法，找出单向链表中倒数第 n 个节点。返回该节点的值。
 */

/**
 * 首先定义两个指针ptr1和ptr2，都指向链表的头节点。
 * 首先将ptr2指针向后移动n步，如果在移动过程中ptr2指针指向了null，说明链表长度小于n，直接返回-1。
 * 如果链表长度大于等于n，ptr2指针现在就指向第n个节点。
 * 然后同时移动ptr1和ptr2指针，直到ptr2指针指向链表的最后一个节点为止。
 * 此时ptr1指针就指向了倒数第n个节点。
 * 返回ptr1指针当前所指向节点的值，即为倒数第n个节点的值。
 */
public class 找到倒数第n个节点 {

    public int findNthFromEnd(ListNode head, int n) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;

        // 将ptr2指针移动到第n个节点的位置
        for (int i = 0; i < n; i++) {
            if (ptr2 == null) {
                return -1; // 链表长度小于n
            }
            ptr2 = ptr2.next;
        }

        // 同时移动ptr1和ptr2指针
        while (ptr2 != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1.val; // 返回倒数第n个节点的值
    }

}