package com.dsa.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q019_Sorting_DuplicateNumberArray {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2, 3, 4, 5 };
		System.out.println("Duplicate Number is : " + DuplicateNumber(nums));

	}

	public static List<Integer> DuplicateNumber(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			// Applying Cyclic sort
			int pos = nums[i];
			if (nums[i] != nums[pos]) {
				swap(nums, i, pos);
			} else {
				i++;
			}
		}

		List<Integer> list = new ArrayList<>();

		for (i = 0; i < nums.length; i++) {
			if (nums[i] != i) {
				list.add(nums[i]);
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
