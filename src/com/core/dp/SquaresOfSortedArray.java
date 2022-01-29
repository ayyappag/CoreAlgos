package com.core.dp;

import java.util.Scanner;

public class SquaresOfSortedArray {
	public static int[] sortedSquaresSimplified(int[] a) {
		int n = a.length;
		int[] squaredArr = new int[n];
		int highestSquareIdx = n - 1;

		int left = 0;
		int right = n - 1;

		while (left <= right) {
			int leftSquare = a[left] * a[left];
			int rightSquare = a[right] * a[right];

			if (leftSquare > rightSquare) {
				squaredArr[highestSquareIdx--] = leftSquare;
				left++;
			} else {
				squaredArr[highestSquareIdx--] = rightSquare;
				right--;
			}
		}

		return squaredArr;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = keyboard.nextInt();
		}
		keyboard.close();

		int[] squaredArray = sortedSquaresSimplified(a);
		for (int i = 0; i < squaredArray.length; i++) {
			System.out.print(squaredArray[i] + " ");
		}
		System.out.println();
	}

}
