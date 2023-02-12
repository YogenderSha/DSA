package com.dsa.BinarySearch;

public class Q009_BinarySearch_InfiniteArray {

	public static void main(String[] args) {
		int[] ar = { 12, 34, 56, 78, 90, 103, 306 };
		System.out.println("The index of 78 in the array is : " + findPos(ar, 78));


	}
	/*
	 * We have Created simply two methods 
	 * 1. findPos :Check if value lies in between
	 * start and end . If it lies than pass both index to BinarySearch. Otherwise
	 * double the size of array after each comparison.
	 * 
	 * 2. BinarySearch: Searches the value of the element and return the position.
	 * 
	 */

	public static int findPos(int[] arr, int target) {
		int start = 0;
		int end = 1;

		while (target > arr[end]) {
			int temp = end + 1;
			end = end + (end - start + 1) * 2; // doubling the index of end every time
			start = temp;
		}
		return BinarySearch(arr, target, start, end);
	}

	static int BinarySearch(int[] arr, int target, int start, int end) {
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
