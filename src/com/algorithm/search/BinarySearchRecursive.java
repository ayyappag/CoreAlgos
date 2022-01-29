package com.algorithm.search;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		System.out.println("index position = " + binarySearch(arr, 900));
		System.out.println("test case 2 position = " + binarySearch(arr, 10));
	}

	public static int binarySearch(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = recursive(arr, target, left, right);
		return result;
	}

	public static int recursive(int arr[], int target, int left, int right) {

		int result;
		if (left > right)
			return -1;

		int middle = (left + right) / 2;
		int middle_ele = arr[middle];

		if (target == middle_ele)
			return middle;
		else if (target < middle_ele) {
			right = middle - 1;
			result = recursive(arr, target, left, right);
			return result;
		} else {
			left = middle + 1;
			result = recursive(arr, target, left, right);
			return result;
		}
	}
}
