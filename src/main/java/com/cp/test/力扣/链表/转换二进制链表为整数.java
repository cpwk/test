package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

/*
  给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
  请你返回该链表所表示数字的 十进制值 。
 */

/**
 * 首先创建一个整数变量result，用于存储最终的十进制数值，初始化为0。
 * 定义一个指针current指向链表头节点head。
 * 然后通过while循环遍历链表，对于每个节点，将result左移一位（即result乘以2），然后将当前节点的值加到result上，也就是result = (result << 1) | current.val。
 * 继续遍历下一个节点，直到链表遍历结束。
 * 最终返回结果result，即为链表所表示二进制数对应的十进制数值。
 */
public class 转换二进制链表为整数 {

    public int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode current = head;

        while (current != null) {
            result = (result << 1) | current.val;
            current = current.next;
        }

        return result;
    }
}