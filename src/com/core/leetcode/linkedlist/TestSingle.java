package com.core.leetcode.linkedlist;

public class TestSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		list.addAtHead(2);
		list.addAtHead(1);
		list.addAtIndex(1, 3);
		list.addAtTail(5);
		list.addAtIndex(2, 4);
		// System.out.println(list.toString());
		System.out.println("size =" + list.size);
		System.out.println("value is " + list.get(list.size - 1));
		for (int i = 0; i < list.size; i++) {
			if (i > 0)
				System.out.print("->");
			System.out.print(list.get(i));
		}
		
		System.out.println();
		list.deleteAtIndex(list.size-2);
		
		for (int i = 0; i < list.size; i++) {
			if (i > 0)
				System.out.print("->");
			System.out.print(list.get(i));
		}

	}

}
