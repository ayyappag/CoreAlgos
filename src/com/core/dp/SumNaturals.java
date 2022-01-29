package com.core.dp;

//Example: Sum of Natural Numbers Using Recursion
// https://www.programiz.com/java-programming/examples/sum-natural-numbers-recursion

public class SumNaturals {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(" sum value is  === " + recursiveSum(n));
	}

	public static int recursiveSum(int n) {
		System.out.print("," + n);
		if (n != 0)
			return n + recursiveSum(n - 1);
		else
			return n;
	}

	public static int recurSum(int n) {
		if (n <= 1)
			return n;
		return n + recurSum(n - 1);
	}

}
