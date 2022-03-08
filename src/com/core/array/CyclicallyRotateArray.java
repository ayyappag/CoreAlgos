package com.core.array;

import java.util.Arrays;

//Time Complexity: O(n)

public class CyclicallyRotateArray {

	// Method for rotation
	static void rotate(int arr[]) {
		int x = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = x;
	}

	static void rotate2(int arr[]) {
		int i = 0, j = arr.length - 1;
		while (i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arr));
		rotate(arr);
		System.out.println(Arrays.toString(arr));
		rotate2(arr);
		System.out.println(Arrays.toString(arr));
		int no_rotations = 3;
		rotations(arr, no_rotations);
		System.out.println(Arrays.toString(arr));

	}

	public static void rotations(int[] arr, int k) {
		for (int i = 0; i < k; i++)
			rotate(arr);
	}

}
