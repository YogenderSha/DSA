package com.dsa.LinearSearch;

public class Q002_LinearSearch_ArrMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 12, 34, 56, 67, 78, 90 };
		System.out.println(arrMax(arr));

	}

	public static int arrMax(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]>max) {
				max=arr[i];
			}
		}return max;
	}

}
