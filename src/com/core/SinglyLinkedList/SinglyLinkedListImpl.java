package com.core.SinglyLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SinglyLinkedListImpl<T> {

	private Node<T> head;
	private Node<T> tail;
	public int size;

	public SinglyLinkedListImpl() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	// add method implementation
	/* Function to insert an element at end */
	public void add(T obj) {
		Node<T> nd = new Node<T>();
		nd.setValue(obj);
		System.out.println("Adding: " + obj);
		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}
		size++;
		// return true;
	}

	/* Function to insert an element at Begin based on the position */
	public void addAtBegin(T obj) {
		Node<T> nd = new Node<T>();
		nd.setValue(obj);
		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			nd.setNextRef(head);
			head = nd;
		}
		size++;
	}

	/* Function to insert an element at end */
	public void addAtEnd(T obj) {
		Node<T> nd = new Node<T>();
		nd.setValue(obj);
		nd.setNextRef(null);
		size++;
		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}

	}

	/* Function to insert an element at position */
	public void add(int position, T obj) {
		Node nd = new Node();
		nd.setValue(obj);
		nd.setNextRef(null);
		Node previousPtr = head;
		position = position - 1;
		for (int i = 1; i < size; i++) {
			if (i == position) {
				Node tmp = previousPtr.getNextRef();
				previousPtr.setNextRef(nd);
				nd.setNextRef(tmp);
				break;
			}
			previousPtr = previousPtr.getNextRef();
		}
		size++;
	}

	/* Function to delete an element at position */
	public void deleteAtPosition(int position) {

		if (position == 1) {
			head = head.getNextRef();
			size--;
			return;
		}
		/*
		 * if (position == size) { Node s = head; Node t = head; while (s !=
		 * tail) { t = s; s = s.getNextRef(); } tail = t; tail.setNextRef(null);
		 * size--; return; }
		 */
		Node ptr = head;
		position = position - 1;
		for (int i = 1; i <= size - 1; i++) {
			if (i == position) {
				Node tmp = ptr.getNextRef();
				tmp = tmp.getNextRef();
				ptr.setNextRef(tmp);
				break;
			}
			ptr = ptr.getNextRef();
		}
		size--;

	}

	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (head.getNextRef() == null) {
			System.out.println(head.getValue());
			return;
		}
		Node nd = head;
		System.out.print(head.getValue() + "->");
		nd = head.getNextRef();
		while (nd.getNextRef() != null) {
			System.out.print(nd.getValue() + "->");
			nd = nd.getNextRef();
		}
		System.out.print(nd.getValue() + "\n");
	}

}
