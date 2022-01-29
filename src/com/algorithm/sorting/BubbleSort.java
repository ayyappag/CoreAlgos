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
		for (int iter = 0; iter < arr.length; iter++) {
			for (int index = 0; index < arr.length - 1 - iter; index++) {
				if (arr[index] > arr[index + 1]) {
					int temp = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = temp;
				}
				System.out.println(Arrays.toString(arr));
				count++;
			}
		}
		System.out.println("no of iterations : " + count);

	}
}
