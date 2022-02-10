package com.core.leetcode.linkedlist;

public class SinglyLinkedList2 {
	private SingleListNode head;

	/** Initialize your data structure here. */
	public SinglyLinkedList2() {
		head = null;
	}

	/** Helper function to return the index-th node in the linked list. */
	private SingleListNode getNode(int index) {
		SingleListNode cur = head;
		for (int i = 0; i < index && cur != null; ++i) {
			cur = cur.next;
		}
		return cur;
	}

	/** Helper function to return the last node in the linked list. */
	private SingleListNode getTail() {
		SingleListNode cur = head;
		while (cur != null && cur.next != null) {
			cur = cur.next;
		}
		return cur;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		SingleListNode cur = getNode(index);
		return cur == null ? -1 : cur.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		SingleListNode cur = new SingleListNode(val);
		cur.next = head;
		head = cur;
		return;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		if (head == null) {
			addAtHead(val);
			return;
		}
		SingleListNode prev = getTail();
		SingleListNode cur = new SingleListNode(val);
		prev.next = cur;
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index == 0) {
			addAtHead(val);
			return;
		}
		SingleListNode prev = getNode(index - 1);
		if (prev == null) {
			return;
		}
		SingleListNode cur = new SingleListNode(val);
		SingleListNode next = prev.next;
		cur.next = next;
		prev.next = cur;
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		SingleListNode cur = getNode(index);
		if (cur == null) {
			return;
		}
		SingleListNode next = cur.next;
		if (index == 0) {
			// modify head when deleting the first node.
			head = next;
		} else {
			SingleListNode prev = getNode(index - 1);
			prev.next = next;
		}
	}

}
