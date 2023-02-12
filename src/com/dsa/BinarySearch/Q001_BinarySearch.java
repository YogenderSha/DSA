package com.dsa.BinarySearch;

public class Q001_BinarySearch {

	public static void main(String[] args) {
		int[] ar = { 12, 34, 56, 78, 90, 103, 306 };
		System.out.println("The index of 78 in the array is : " + BinarySearch(ar, 78));

	}

	static int BinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] > target) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
