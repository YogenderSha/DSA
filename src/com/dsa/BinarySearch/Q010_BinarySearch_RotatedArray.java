package com.dsa.BinarySearch;

public class Q010_BinarySearch_RotatedArray {

	public static void main(String[] args) {
		/*
		 * Rotated Sorted Array : Rotated array is the array which has is made by
		 * putting element in the starting from the end one by one.
		 */
		int[] ar = { 4, 5, 8, 9, 0, 1, 2, 3 };
		System.out.println("The position of the element is : " + ans(ar, 3));
		System.out.println("The position of the element is : " + ans(ar, 0));

	}

	/*
	 * To search in the Rotated sorted array we first have to find the pivot element
	 * which is the biggest element. Then we can search for two halfs one by one
	 * with binary search.
	 * 
	 * There are four cases when finding a pivot
	 *
	 * 1. Mid element is the pivot element 2. Mid element is the next element than
	 * pivot element 3. Mid element is less than start element i.e. it lies in the
	 * array after pivot element. Hence set end=mid-1 4. Mid element is more than
	 * start element i.e. it lies in the array before pivot element. Hence set
	 * start=mid+1
	 */
	public static int ans(int[] nums, int target) {
		int pivot = findPivot(nums);
		if (nums[pivot] == target) {
			return pivot;
		}
		int pos1 = BinarySearch(nums, target, 0, pivot - 1);
		if (pos1 == -1) {
			int pos2 = BinarySearch(nums, target, pivot + 1, nums.length - 1);
			return pos2;
		}
		return pos1;
	}

	public static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > 0 && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;

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
