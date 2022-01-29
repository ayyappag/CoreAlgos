package com.algorithm.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] intArray = new int[] { 2, 3, 4, 10, 40 };
		int arr[] = { 2, 3, 4, 10, 40 };
		int index = search(intArray, 900);
		System.out.println("index = " + index);

		int index2 = search(arr, 3);
		System.out.println("index2 = " + index2);
		int index23 = search(arr, 900);
		System.out.println("index23 = " + index23);
	}

	public static int search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			int middle_element = arr[middle];

			if (target == middle_element)
				return middle;
			else if (target > middle_element)
				left = middle + 1;
			else // if(target < middle_element)
				right = middle - 1;
		}

		return -1;
	}

}
