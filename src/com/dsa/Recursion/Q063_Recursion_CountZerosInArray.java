//Count Number of Zeroes in an Array with Recursion 

package com.dsa.Recursion;

public class Q063_Recursion_CountZerosInArray{
	
	public static void main(String[] args) {
		int[] arr= {23,34,0,4,45,54,0};
		System.out.println(CountZeroesinArray(arr));
	}
 
	
	public static int CountZeroesinArray(int[] arr) {
		return CountZeroes(arr, 0, 0);
	}
	
	public static int CountZeroes(int[] arr, int index, int count) {
		if (index == arr.length) {
			return count;
		}

		if (arr[index] == 0) {
			count++;
		}

		return CountZeroes(arr, index + 1, count);
	}

	
}
