package com.core.array;

// Its used with Black Swap algorithm 
// complexity : O(n)

public class LeftRotateArray2 {

	static void leftRotate(int arr[], int d, int length) {
		int i, j;

		if (d == 0 || d == length)
			return;

		i = d;
		j = length - d;
		while (i != j) {
			if (i < j) {
				swap(arr, d - i, d + j - i, i);
				j -= i;
			} else {
				swap(arr, d - i, d, j);
				i -= j;
			}
		}
		swap(arr, d - i, d, i);

	}

	/*
	 * This function swaps d elements starting at index fi with d elements starting
	 * at index si
	 */
	public static void swap(int arr[], int fi, int si, int d) {
		int i, temp;
		for (i = 0; i < d; i++) {
			temp = arr[fi + i];
			arr[fi + i] = arr[si + i];
			arr[si + i] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		leftRotate(arr, 2, 7);
		// printArray(arr, 7);

	}

}
