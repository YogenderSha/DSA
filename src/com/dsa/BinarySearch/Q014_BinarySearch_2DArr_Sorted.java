package com.dsa.BinarySearch;

import java.util.Arrays;

public class Q014_BinarySearch_2DArr_Sorted {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("The positions of the 7 in the given array :" + Arrays.toString(FindNum(arr, 14)));

	}

	public static int[] FindNum(int[][] matrix, int target) {
		int row = matrix.length;
		int col = matrix[0].length;

		int rstart = 0;
		int rend = row - 1;
		int midcol = col / 2;

		while (rstart < rend - 1) {
			int mid = rstart + (rend - rstart) / 2;
			if (matrix[mid][midcol] == target) {
				return new int[] { mid, midcol };
			}

			if (matrix[mid][midcol] > target) {
				rend = mid;
			} else {
				rstart = mid;
			}
		}
		// If loop is over it means only two rows are left
		if (matrix[rstart][midcol] == target) {
			return new int[] { rstart, midcol };
		}

		if (matrix[rend][midcol] == target) {
			return new int[] { rend, midcol };
		}

		int[] ar = BinarySearch(matrix, rstart, target);
		if (ar[0] == -1 && ar[1] == -1) {
			ar = BinarySearch(matrix, rend, target);
		}
		return ar;
	}

	public static int[] BinarySearch(int[][] arr, int row, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[row][mid] == target) {
				return new int[] { row, mid };
			}

			if (arr[row][mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return new int[] { -1, -1 };

	}

}
