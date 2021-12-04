package com.core.SinglyLinkedList;

/*http://www.java2novice.com/data-structures-in-java/linked-list/singly-linked-list/
 */
public class Node<T> implements Comparable<T> {

	private Node<T> nextRef;
	private T value;
	

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public int compareTo(T arg) {
		// TODO Auto-generated method stub

		if (this.value == arg)
			return 0;
		return 1;
	}

}
