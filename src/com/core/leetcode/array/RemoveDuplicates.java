package com.core.leetcode.array;

import java.util.Arrays;

public class RemoveDuplicates {
	static int removeDuplicates(int arr[], int n) {
		// Return, if array is empty
		// or contains a single element
		if (n == 0 || n == 1)
			return n;

		int[] temp = new int[n];

		// Start traversing elements
		int j = 0;
		for (int i = 0; i < n - 1; i++)
			// If current element is not equal
			// to next element then store that
			// current element
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];

		// Store the last element as whether
		// it is unique or repeated, it hasn't
		// stored previously
		temp[j++] = arr[n - 1];

		// Modify original array
		for (int i = 0; i < j; i++)
			arr[i] = temp[i];

		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;
		
		int count = approach2(arr);
		for (int i = 0; i < count; i++)
			System.out.print(arr[i] + " ");

		n = removeDuplicates(arr, n);

		System.out.println(" = " + Arrays.toString(arr));
		// Print updated array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static int approach2(int arr[]) {

		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}

		arr[j++] = arr[arr.length-1];
		return j;
	}
}
