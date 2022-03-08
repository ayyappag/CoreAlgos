package com.algorithm.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] intArray = new int[] { 2, 7, 6, 90, 3, 9 };
		int index = lSearch(intArray, 900);
		System.out.println("index = " + (index > 0 ? index : "value is not there"));

	}

	public static int lSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target)
				return i;
		}
		return -1;
	}
}
