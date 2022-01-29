package com.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3, 90, -2, 8, 76, 36 };
		bubbleSort(arr);
		System.out.println("final output:" + Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.println(Arrays.toString(arr));
				count++;
			}
		}
		System.out.println("no of iterations : " + count);

	}
}
