package com.core.dp;

import java.util.LinkedList;
import java.util.List;

public class MinStackList {

	static List<Integer> stack = new LinkedList<Integer>();
	static List<Integer> minstack = new LinkedList<Integer>();

	public static void main(String[] args) {

		push(8);
		push(6);
		push(1);
		push(3);

		System.out.println("stack" + stack.toString());
		System.out.println("min stack" + minstack.toString());
		pop();

		System.out.println("pop stack" + stack.toString());
		System.out.println("pop min stack" + minstack.toString());
		System.out.println("get min values " + getMin());
		pop();

		System.out.println("pop2 stack" + stack.toString());
		System.out.println("pop2 min stack" + minstack.toString());
		System.out.println("get min values " + getMin());
	}

	public static void push(int element) {

		stack.add(element);
		if (minstack.size() == 0) {
			minstack.add(element);
		} else {
			if (minstack.get(minstack.size() - 1) > element) {
				minstack.add(element);
			}
		}
	}

	public static void pop() {

		int element = stack.get(stack.size() - 1);

		stack.remove(stack.size() - 1);

		if (minstack.get(minstack.size() - 1) == element)
			minstack.remove(minstack.size() - 1);
	}

	public static int getMin() {
		return minstack.get(minstack.size() - 1);
	}
}
