package com.dsa.Sorting;

public class Q016_Sorting_MissingNumber {
	/*
	 * Missing Number Find {LeetCode : 268}
	 * https://leetcode.com/problems/missing-number/
	 * 
	 * Approach : 
	 * 1. Cyclic sort given array [0,n] 
	 * 2. If(arr[i]!=i)
	 *    return i; else i++
	 * 3. return arr.length; 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] nums = { 3, 0, 1 };
		System.out.println(" The Missing Number is :" +MissingNumber(nums));
		

	}

	public static int MissingNumber(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			// Applying Cyclic sort
			int pos = nums[i];
			if (nums[i]<nums.length && nums[i] != nums[pos]) {
				swap(nums, i, pos);
			} else {
				i++;
			} 
		}

		for (i = 0; i < nums.length; i++) {
			if (nums[i]!=i) {
				return i;
			}
		}
		return nums.length;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
