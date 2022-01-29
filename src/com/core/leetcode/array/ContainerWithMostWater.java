package com.core.leetcode.array;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("approach one = " + maxArea1(height));
	}

	
	// normal : Time complexity : O(n) Space complexity : O(1)
	public static int maxArea1(int[] height) {

		int maxarea = 0, left = 0, right = height.length - 1;
		while (left < right) {
			maxarea = Math.max(maxarea, 
					Math.min(height[left], height[right]) 
					* (right - left));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}

		return maxarea;
	}
	

	// Brute Force : 0(n^2) --time complexity
	    public int maxArea2(int[] height) {
	        int maxarea = 0;
	        for (int i = 0; i < height.length; i++)
	            for (int j = i + 1; j < height.length; j++)
	                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
	        return maxarea;
	    }
	
}
