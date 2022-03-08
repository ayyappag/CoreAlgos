package com.core.dp;

public class ConvertIntArray {

	public static void main(String[] args) {
		String arr = "[1,2]";
		String[] items = arr.replaceAll("\\[", "").
							 replaceAll("\\]", "").
							 replaceAll("\\s", "").
							 split(",");

		int[] results = new int[items.length];

		for (int i = 0; i < items.length; i++) {
			try {
				results[i] = Integer.parseInt(items[i]);
			} catch (NumberFormatException nfe) {
				// NOTE: write something here if you need to recover from formatting errors
			}
			;
		}
	}
}
