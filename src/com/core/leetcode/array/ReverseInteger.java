package com.core.leetcode.array;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("= " + reverseLeetcode(-123));
	}

	public static int reverseLeetcode(int x) {
		String reversed = new StringBuilder()
				.append(Math.abs(x)).reverse().toString();
		try {
			return (x < 0) ? Integer.parseInt(reversed) * -1 
					: Integer.parseInt(reversed);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	static int reversDigits(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}

}
