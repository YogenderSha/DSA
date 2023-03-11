package com.dsa.Sorting;

import java.util.Arrays;

public class C005_Sorting_cyclic {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 2, 1, 4 };
		CyclicSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void CyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int pos = arr[i] - 1;
			if (arr[i] == arr[pos]) {
				i++;
			}else {
				swap(arr,i,pos);
			}
		}
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}


}
