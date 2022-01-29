package com.core.dp;

import java.util.Arrays;

public class IsPalindromic {

	public static void main(String[] args) {
		int i = 1234321;
		int[] numbers = convertArray(i);
		System.out.println("isPalindrome = " + isPalindrome(numbers));
	}

	public static int[] convertArray(int number) {
		String temp = Integer.toString(number);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			numbers[i] = temp.charAt(i) - '0';
		}
		System.out.println(Arrays.toString(numbers));
		return numbers;
	}

	public static boolean isPalindrome(int[] numbers) {

		int i = 0, j = numbers.length - 1;
		for (i = 0; i < j; i++, j--) {
			if (numbers[i] != numbers[j])
				return false;
		}
		return true;
	}
}
