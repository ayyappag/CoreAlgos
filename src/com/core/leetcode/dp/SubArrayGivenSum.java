package com.core.leetcode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubArrayGivenSum {

	public static void main(String[] args) {

		int a[] = { 1, 3, 3, 2, -1 };
		int i = subarraySumLeetcode(a, 2);

		System.out.println("First method " + i);

		System.out.println("Second method " + subarraySumLeetcode2(a, a.length, 4));

		int[] t = subarraySum3(a, a.length, 1);
		System.out.println("3 method " + Arrays.toString(t));

		List<int[]> list = subarraySumLeetcodeList(a, 2);
		System.out.println(list);
		list.stream().map(m -> Arrays.toString(m)).forEach(System.out::print);

	}

	// number of combinations - better method -- correct
	public static int subarraySumLeetcode(int[] nums, int k) {
		System.out.println(" number of combinations");
		int count = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

	// number of combinations - not working 
	public static List<int[]> subarraySumLeetcodeList(int[] nums, int k) {
		System.out.println(" number of combinations");
		int count = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		List<int[]> list = new ArrayList<int[]>();
		//map.put(0, 1);
		System.out.println("list method " + Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
				list.add(new int[] { map.get(sum - k), i });
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		System.out.println("list method 2 " + Arrays.toString(nums));
		
		return list;
	}

	static int subarraySumLeetcode2(int[] arr, int n, int k) {
		int count = 0;
		for (int start = 0; start < arr.length; start++) {
			int sum = 0;
			for (int end = start; end < arr.length; end++) {
				sum += arr[end];
				if (sum == k)
					count++;
			}
		}
		return count;
	}

	// Sliding Window Solution -- it will give start and end index

	static int[] subarraySum3(int[] arr, int n, int s) {
		int l = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			while (sum >= s) {
				if (sum == s) {
					return new int[] { l + 1, i + 1 };
				}
				sum -= arr[l];
				l++;
			}
		}
		return new int[] { -1 };
	}
}
