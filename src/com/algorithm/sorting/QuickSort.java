package com.algorithm.sorting;

import java.util.Arrays;

public class QuickSort {
	static int count = 0;

	public static void main(String[] args) {
		// int arr[] = { 10, 80, 30, 90, 40, 50, 70,-1 };
		int arr[] = { 3, 90, -2, 8, 76, 36 };
		sorting(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		System.out.println("count = " + count);
	}

	public static void sorting(int[] arr, int start, int end) {

		if (start >= end)
			return;

		int pivot = start;
		int left = start + 1;
		int right = end;

		while (left <= right) {
			if ((arr[left] > arr[pivot]) && (arr[right] < arr[pivot])) {
				swap(arr, left, right);
			}
			if (arr[left] <= arr[pivot])
				left++;
			if (arr[right] >= arr[pivot])
				right--;
			count++;
		}
		swap(arr, pivot, right);
		sorting(arr, start, right - 1);
		sorting(arr, right + 1, end);
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
