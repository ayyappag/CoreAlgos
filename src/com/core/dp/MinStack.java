package com.core.dp;

import java.util.Arrays;

public class MinStack {

	static int i = 1, j = 0;

	public static void main(String[] args) {
		int[] stack = new int[10]; // facing problem with default size and value
		int[] minstack = new int[10];
		push(stack, minstack, 4);
		push(stack, minstack, 6);
		push(stack, minstack, 1);
	}

	public static void push(int[] stack, int[] minstack, int element) {

		System.out.println("length = " + i);
		stack[i] = element;
		if (j == 0) {
			minstack[j] = element;
			j++;
		} else {
			if (minstack[j-1] > element) {
				minstack[j] = element;
				j++;
			}
		}
		i++;
		System.out.println("stack" + Arrays.toString(stack));
		System.out.println("min stack" + Arrays.toString(minstack));
	}

	public static void pop() {

	}

	public static int getMin() {
		return 0;
	}
}
