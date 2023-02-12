package com.dsa.BinarySearch;

public class Q003_BinarySearch_floor {

	public static void main(String[] args) {
		/*
		 * Floor of a target number is the greatest number present in the array which is
		 * smaller than or equal to target number.
		 */
		int[] ar = { 12, 34, 45, 56, 78, 89, 678, 789, 900 };
		System.out.println("The Floor of 78 in the array is : " + floorSearch(ar, 78));
		System.out.println("The Floor of 90 in the array is : " + floorSearch(ar, 90));
		System.out.println("The Floor of 800 in the array is : " + floorSearch(ar, 800));

	}

	static int floorSearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		// if the number is already smallest from the minimum element of array
		if (target < arr[start]) {
			return -1;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return arr[mid];
			}
		}
		return arr[end];
	}

}
