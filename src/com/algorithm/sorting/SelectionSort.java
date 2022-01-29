package com.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 3, 90, -2, 8, 76, 36 };
		selectionSort(arr);
		System.out.println("final output:" + Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int min_x = i;
			for (int item = i + 1; item < arr.length; item++) {
				count++;
				if (arr[min_x] > arr[item])
					min_x = item;
			}
			int temp = arr[i];
			arr[i] = arr[min_x];
			arr[min_x] = temp;
		}
		System.out.println("no of iterations : " + count);
	}
}
