package com.cp.test.力扣.链表;

import com.cp.test.model.ListNode;

import java.util.ArrayList;
import java.util.List;

public class 转换链表为数组 {

    public int[] listToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}