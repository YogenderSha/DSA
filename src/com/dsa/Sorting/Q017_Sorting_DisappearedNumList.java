package com.dsa.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Q017_Sorting_DisappearedNumList {
	/*
	 * Merge two sorted arrays into first one 
	 * {Leetcode : 448}
	 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	 * */

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		

	}

	public static List<Integer> MissingNum(int[] nums) {
		int i = 0;

		// Sorting the Array
		while (i < nums.length) {
			int pos = nums[i] - 1;
			if (nums[i] != nums[pos]) {
				swap(nums, i, pos);
			} else {
				i++;
			}
		}

		// Checking the Array
		List<Integer> list = new ArrayList<>();
		for (i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				list.add(i + 1);
			}
		}
		return list;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
