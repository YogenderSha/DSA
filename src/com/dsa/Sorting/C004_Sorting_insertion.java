package com.dsa.Sorting;

import java.util.Arrays;

public class C004_Sorting_insertion {

	public static void main(String[] args) {
		// Sorting with Insertion SORT in Ascending Order
		int[] arr = { 5, 3, 6, 1, 7 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}else {
					break;
				}
			}
		}
	}
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
