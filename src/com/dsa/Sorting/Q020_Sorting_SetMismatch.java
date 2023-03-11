package com.dsa.Sorting;

import java.util.Arrays;

public class Q020_Sorting_SetMismatch {
	/*
	 * Set Mismatch {Leetcode : 645} https://leetcode.com/problems/set-mismatch/
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 1 };
		System.out.println(Arrays.toString(CyclicSort(arr)));

	}

	public static int[] CyclicSort(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int pos = nums[i] - 1;
			if (nums[i] != nums[pos]) {
				swap(nums, i, pos);
			} else {
				i++;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				return new int[] { nums[j], j + 1 };
			}
		}
		return new int[] {-1,-1};
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
