package com.example.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTests {
    @Test
    @DisplayName("[1, 2, 3], pos = 1 has cycle")
    void cycle_test_01() {
        Solution solution = new Solution();
        ListNode node2 = new ListNode(3);
        ListNode node1 = new ListNode(2);
        node1.next = node2;
        ListNode head = new ListNode(1);
        head.next = node1;
        node2.next = node1;
//        System.out.println(head);
        assertTrue(solution.hasCycle(head), "[1, 2, 3], pos = 1 has cycle");
    }
}
