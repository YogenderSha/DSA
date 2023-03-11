package com.dsa.BinarySearch;

public class Q015_BinarySearch_2DArr_Sorted_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean FindNum(int[][] matrix, int target) {
		int row = matrix.length;
		int col = matrix[0].length;

		int rstart = 0;
		int rend = row - 1;
		
		if(col==1) {
			
		}
		int midcol = col / 2;

		while (rstart < rend - 1) {
			int mid = rstart + (rend - rstart) / 2;
			if (matrix[mid][midcol] == target) {
				return true;
			}

			if (matrix[mid][midcol] > target) {
				rend = mid;
			} else {
				rstart = mid;
			}
		}
		// If loop is over it means only two rows are left
		if (matrix[rstart][midcol] == target) {
			return true;
		}

		if (matrix[rend][midcol] == target) {
			return true;
		}

		int[] ar = BinarySearch(matrix, rstart, target);
		if (ar[0] == -1 && ar[1] == -1) {
			ar = BinarySearch(matrix, rend, target);
		}
		if(ar[0]!=-1 && ar[1]!=-1) {
			return true;
		}
		
		return false;
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
