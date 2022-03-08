package com.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 90, -2, 8, 76, 36 };
		
		insertionSort(arr);
		System.out.println("final output:" + Arrays.toString(arr));

	}

	public static void insertionSort(int[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int last = i - 1; // previousIndex
			while (last >= 0 && key < arr[last]) {
				arr[last + 1] = arr[last];
				last = last - 1;
				count++;
			}
			arr[last + 1] = key;
		}

		System.out.println("no of iterations : " + count);

	}
}
