package com.core.leetcode.linkedlist;

//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (slow != null && fast != null && fast.next != null && fast.next.next != null && slow.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;

		}
		return false;
	}

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}
