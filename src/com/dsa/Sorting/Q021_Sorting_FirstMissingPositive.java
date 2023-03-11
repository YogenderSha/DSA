package com.dsa.Sorting;

import java.util.Arrays;

public class Q021_Sorting_FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 0,-1,-4 };
		System.out.println(CyclicSort(arr));

	}

	public static int CyclicSort(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int pos = nums[i] - 1;
			if (nums[i] > 0 &&nums[i]<nums.length && nums[i] != nums[pos]) {
				swap(nums, i, pos);
			} else {
				i++;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				return j + 1;
			}
		}
		return 0;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
