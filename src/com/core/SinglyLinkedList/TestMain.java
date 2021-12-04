package com.core.SinglyLinkedList;


public class TestMain {

	public static void main(String[] args) {
		SinglyLinkedListImpl<Object> name = new SinglyLinkedListImpl<Object>();
		name.add(1);
		name.add(15);
		name.add(41);
		name.display();
		name.addAtBegin(101);

		/*
		 * for (Object value : name) { System.out.println(value); }
		 */

		name.display();
		System.out.println("dfsf:" + name.isEmpty());
		
		name.add(3, 222);
		
		name.display();
		
		name.addAtEnd(333);
		name.display();
		name.deleteAtPosition(4);
		name.display();
	}

}
