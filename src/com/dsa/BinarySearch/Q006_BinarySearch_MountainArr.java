package com.dsa.BinarySearch;

public class Q006_BinarySearch_MountainArr {

	public static void main(String[] args) {
		//Find the peak Element of a mountain Array 
		int[] ar = { 1, 4, 5, 6, 8, 9, 10, 20, 7, 3, 2 };
		
		System.out.println("The peak of the given array is : "+ findPeak(ar));
		

	}public static int findPeak(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int mid=start+(end-start)/2;

			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}
		}return arr[start];
		
	}
	
}
