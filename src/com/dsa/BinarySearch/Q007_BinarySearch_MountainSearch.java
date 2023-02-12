package com.dsa.BinarySearch;

public class Q007_BinarySearch_MountainSearch {

	public static void main(String[] args) {

		// Find Index of element in the Mountain Array
		int[] nums = { 1, 4, 5, 6, 8, 9, 10, 20, 7, 3, 2 };
		System.out.println("Position of the 6 in the nums is : " + MountainSearch(nums, 6));

	}

	public static int MountainSearch(int[] arr, int target) {
		int peak = findPeak(arr);
		if (arr[peak] == target) {
			return peak;
		}

		int pos1 = BinarySearch(arr, target, 0, peak - 1);
		if (pos1 == -1) {
			int pos2 = BinarySearch(arr, target, peak = 1, arr.length - 1);
			return pos2;
		}
		return pos1;
	}

	// Finding Peak Element
	public static int findPeak(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			}
		}
		return start;

	}

	// order Agnostic Binary Search
	public static int BinarySearch(int[] arr, int target, int start, int end) {
		boolean isAsc = false;
		if (arr[start] < arr[end]) {
			isAsc = true;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}

			if (isAsc) {
				if (arr[mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (arr[mid] < target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

}
