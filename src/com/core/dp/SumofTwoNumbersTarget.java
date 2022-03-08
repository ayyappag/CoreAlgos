package com.core.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// https://leetcode.com/problems/two-sum/
public class SumofTwoNumbersTarget {

	public static void main(String[] args) {
		int[] arr = { 0, 90, -2, 8, 76, 36 };
		int[] result = findTwoSum(arr, 90);
		System.out.println("resut : " + Arrays.toString(result));
	}

	// better
	private static int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			} else {
				numMap.put(nums[i], i);
			}
		}
		return new int[] {}; 
	}
	
	
	// here is another approach which works when you need to return the numbers instead of their indexes.
	private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

}
