package com.dsa.BinarySearch;

import java.util.Arrays;

public class Q005_BinarySearch_elemPositions {

	// Find First and Last Position of Element in Sorted Array (LEETCODE : 34)

	public static void main(String[] args) {
		int[] ar = { 3, 5, 6, 7, 7, 7, 7, 8, 8, 9, 9 };
		System.out.println(
				"First and Last index of the number 7 in the given array is : " + Arrays.toString(searchRange(ar, 7)));

	}

	static int[] searchRange(int[] nums, int target) {
		// returns the array of first and last index of the given number
		int[] ans = { -1, -1 };
		int start = BinarySearch(nums, target, true);
		int end = BinarySearch(nums, target, false);
		ans[0] = start;
		ans[1] = end;
		return ans;
	}

	static int BinarySearch(int[] arr, int target, boolean firstStartIndex) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		// returns the first number index when firstStartIndex is true and return last
		// index number when it is false
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				ans = mid;
				if (firstStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
