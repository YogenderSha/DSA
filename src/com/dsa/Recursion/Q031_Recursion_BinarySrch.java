package com.dsa.Recursion;

public class Q031_Recursion_BinarySrch {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 56, 78, 99 };
		System.out.println(BinarySearch(arr, 34, 0, 4));
	}

	public static int BinarySearch(int[] arr, int target, int s, int e) {
		if (s > e) {
			return -1;
		}

		int m = s + (e - s) / 2;
		if (arr[m] == target) {
			return m;
		}

		if (arr[m] < target) {
			return BinarySearch(arr, target, m + 1, e);
		}

		return BinarySearch(arr, target, s, m - 1);

	}

}
