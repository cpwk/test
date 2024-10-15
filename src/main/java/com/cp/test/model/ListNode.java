/*
 * Ant Group
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.cp.test.model;

/**
 * @author cp
 * @version ListNode.java, v 0.1 2024年07月15日 11:01 cp
 */
public class ListNode {

    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}