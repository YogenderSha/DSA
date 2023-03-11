package com.dsa.BinarySearch;

import java.util.Arrays;

public class Q013_BinarySearch_2DArr {

	public static void main(String[] args) {
		// Binary Search in sorted array Row wise and column wise
		int[][] arr = { { 23, 56, 78 }, { 34, 56, 89 }, { 12, 34, 71 } };
		System.out.println("The positions of the 89 in the given array(if row and colmns starts from 1) :"+Arrays.toString(arrSearch(arr, 89)) );
		

	}
	public static int[] arrSearch(int[][] arr, int target) {
		int row = 0;
		int col = arr.length - 1;

		while (col >= 0 && row < arr.length) {
			if (arr[row][col] == target) {
				return new int[] { row+1, col+1};
			}

			if (arr[row][col] > target) {
				col--;
			} else {
				row++;
			}
		}
		return new int[] { -1, -1 };

	}

}
