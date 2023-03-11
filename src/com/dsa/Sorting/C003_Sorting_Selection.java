package com.dsa.Sorting;

import java.util.Arrays;

public class C003_Sorting_Selection {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 1, 7 };
		SelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void SelectionSort(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int end = arr.length - i - 1;
			for (int j = 0; j <= end; j++) {
				if (arr[j] > max) {
					max = j;
				}
			}
			swap(arr, max, end);

		}
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
