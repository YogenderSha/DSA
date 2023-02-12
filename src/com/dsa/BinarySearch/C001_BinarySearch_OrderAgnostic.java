package com.dsa.BinarySearch;

public class C001_BinarySearch_OrderAgnostic {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 7, 8, 9, 10 };
		int[] arr2 = { 9, 8, 7, 6, 5, 4, 2, 1 };
		System.out.println("The position of 4 in the array 1 and array 2 are respectively : " + BinarySearch(arr, 4)
				+ " & " + BinarySearch(arr2, 4));

	}

	// Order Agnostic Binary Search is the Binary Search which works for ascending
	// as well as descending Order.
	public static int BinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
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
