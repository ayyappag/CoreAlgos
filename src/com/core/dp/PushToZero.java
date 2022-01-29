package com.core.dp;

import java.util.Arrays;

public class PushToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println("\nAfter");
		pushZero(arr, arr.length);
		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void pushZero(int[] arr, int length) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				arr[count++] = arr[i];
		}
		while (count < length)
			arr[count++] = 0;

	}

}
