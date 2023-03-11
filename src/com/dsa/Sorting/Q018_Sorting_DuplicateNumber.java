package com.dsa.Sorting;

import java.util.Arrays;

public class Q018_Sorting_DuplicateNumber {
	
	/*
	 * Find the Duplicate Number 
	 * {Leetcode : 287}
	 * https://leetcode.com/problems/find-the-duplicate-number/
	 * */

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		int Duplicate=DuplicateNumber(nums);
		System.out.println("Duplicate Number is : "+Duplicate);
	}

	public static int DuplicateNumber(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			// Applying Cyclic sort
			int pos=nums[i]-1;
			if (nums[i] !=i+1) {
				if(nums[i]==nums[nums[i]-1]) {
					return nums[i];
				}
				else {
					swap(nums, i, pos);
				}

			} else {
				i++;
			}
			
		}return 0;

//		for (i = 0; i < nums.length; i++) {
//			if (nums[i] != i-1) {
//				return nums[i];
//			}
//		}
//		return nums.length;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
