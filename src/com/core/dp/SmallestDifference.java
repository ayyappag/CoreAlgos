package com.core.dp;

public class SmallestDifference {
	
	// Brute Force approach: Use two for loops
	public static int[] findSmallestDifferencePair_Naive(int[] a1, int[] a2) {
		double smallestDiff = Double.MAX_VALUE;
		int[] smallestDiffPair = new int[2];

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				int currentDiff = Math.abs(a1[i] - a2[j]);
				if (currentDiff < smallestDiff) {
					smallestDiff = currentDiff;
					smallestDiffPair[0] = a1[i];
					smallestDiffPair[1] = a2[j];
				}
			}
		}
		return smallestDiffPair;
	}

	public static void main(String[] args) {
		int[] a1 = new int[] { -1, 5, 10, 20, 28, 3 };
		int[] a2 = new int[] { 26, 134, 135, 15, 17 };

		int[] pair = findSmallestDifferencePair_Naive(a1, a2);
		System.out.println(pair[0] + " " + pair[1]);
	}
}
