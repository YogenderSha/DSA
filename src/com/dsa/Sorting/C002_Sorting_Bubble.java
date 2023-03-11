package com.dsa.Sorting;

import java.util.Arrays;

public class C002_Sorting_Bubble {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 5, 2 };
		System.out.println(Arrays.toString(arr));
		Bubble(arr, false);
		System.out.println("Array after the sorting is : " + Arrays.toString(arr));

	}

	public static void Bubble(int[] arr, boolean asc) {
		/*
		 * Bubble sort has two indexes i and j. For each value of i, j traverses from i
		 * to arr.length-i.
		 * 
		 * if asc =true then convert into ascending array otherwise in descending array
		 */
		for (int i = 0; i < arr.length; i++) {
			boolean unsorted = false;

			for (int j = 1; j < arr.length - i; j++) {
				if (asc) {
					if (arr[j] < arr[j - 1]) {
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
						// creating a boolean for array not already sorted
						unsorted = true;
					}
				} else {
					if (arr[j] > arr[j - 1]) {
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
						// creating a boolean for array not already sorted
						unsorted = true;
					}
				}

			}
			if (!unsorted) {
				break;
			}
		}
	}

}
