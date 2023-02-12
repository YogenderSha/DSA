package com.dsa.BinarySearch;

public class Q004_BinarySearch_CharCeiling {

	public static void main(String[] args) {
		char[] ar = { 'a', 'b', 'c', 'd', 'h', 'p', 'y' };
		System.out.println("The Ceiling of d in the array is : " + CeilingChar(ar, 'd'));
		System.out.println("The Ceiling of p in the array is : " + CeilingChar(ar, 'p'));
		System.out.println("The Ceiling of x in the array is : " + CeilingChar(ar, 'x'));
		System.out.println("The Ceiling of e in the array is : " + CeilingChar(ar, 'e'));
		System.out.println("The Ceiling of z in the array is : " + CeilingChar(ar, 'z'));
		System.out.println("The Ceiling of y in the array is : " + CeilingChar(ar, 'y'));

	}

	static char CeilingChar(char[] arr, char target) {
		int start = 0;
		int end = arr.length - 1;

		// if the number is already greatest from the maximum element of array
		if (target >= arr[end]) {
			return arr[0];
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return arr[start];
	}

}
