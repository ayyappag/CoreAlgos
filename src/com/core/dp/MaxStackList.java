package com.core.dp;

import java.util.LinkedList;
import java.util.List;

public class MaxStackList {

	static List<Integer> stack = new LinkedList<Integer>();
	static List<Integer> minstack = new LinkedList<Integer>();

	public static void main(String[] args) {

		push(8);
		push(6);
		push(1);
		push(3);
		push(9);

		System.out.println("1 - stack" + stack.toString());
		System.out.println("1 - min stack" + minstack.toString());
		pop();

		System.out.println("2 - pop stack" + stack.toString());
		System.out.println("2 - pop min stack" + minstack.toString());
		System.out.println("2 - get max value " + getMax());
		pop();

		System.out.println("3 - pop2 stack" + stack.toString());
		System.out.println("3 - pop2 min stack" + minstack.toString());
		System.out.println("3 - get max value " + getMax());
	}

	public static void push(int element) {

		stack.add(element);
		if (minstack.size() == 0) {
			minstack.add(element);
		} else {
			if (minstack.get(minstack.size() - 1) < element) {
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

	public static int getMax() {
		return minstack.get(minstack.size() - 1);
	}
}
