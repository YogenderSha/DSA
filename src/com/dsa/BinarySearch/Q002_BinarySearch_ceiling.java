package com.dsa.BinarySearch;

public class Q002_BinarySearch_ceiling {

	public static void main(String[] args) {
		/*
		 * Ceiling of a target number is the smallest number present in the array which
		 * is greater than or equal to target number.
		 */
		int[] ar = { 12, 34, 45, 56, 78, 89, 678, 789, 900 };
		System.out.println("The Ceiling of 78 in the array is : " + CeilingSearch(ar, 78));
		System.out.println("The Ceiling of 90 in the array is : " + CeilingSearch(ar, 90));
		System.out.println("The Ceiling of 800 in the array is : " + CeilingSearch(ar, 800));
		System.out.println("The Ceiling of 1000 in the array is : " + CeilingSearch(ar, 1000));

	}

	static int CeilingSearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		// if the number is already greatest from the maximum element of array
		if (target > arr[end]) {
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
		return arr[start];
	}

}
