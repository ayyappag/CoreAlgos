package com.core.leetcode.array;

import java.util.Arrays;

// https://leetcode.com/problems/add-two-numbers/
public class AddTwoArray {

	public static void main(String[] args) {
		int[] l1 = { 9, 9, 9, 9, 9, 9, 1 }, l2 = { 9, 9, 9, 9 };
		int addition = convertInt(l1) + convertInt(l2);
		System.out.println(addition);
		System.out.println(Arrays.toString(convertArray(addition)));

	}

	public static int convertInt(int[] arr) {
		StringBuilder builder = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			builder.append(arr[i]);
		}
		return Integer.parseInt(builder.toString());
	}

	public static int[] convertArray(int a) {
		String str = Integer.toString(a);
		int[] arr = new int[str.length()];
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			arr[j] = str.charAt(i) - '0';
			j++;
		}

		return arr;

	}
	// LeetCode solution

	// Definition for singly-linked list.
	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

}
