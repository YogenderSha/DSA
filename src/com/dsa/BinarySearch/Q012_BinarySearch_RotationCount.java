package com.dsa.BinarySearch;

/*
 * Source:geeksforgeeks
 * Link: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/ 
 * */

public class Q012_BinarySearch_RotationCount {

	public static void main(String[] args) {
		int[] nums=  { 4, 4, 4, 0, 1, 2, 3,4 };
		System.out.println("The number of total Rotations are  : " +RotationCount(nums));

	}public static int RotationCount(int[] ar) {
		int pivot=findPivot(ar);
		if(pivot!=-1) {
			return pivot+1;
		}else {
			return -1;
		}
	}
	
	
	
public static int findPivot(int[] arr) {
		
		//Total 5 cases
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > 0 && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if(arr[mid]==arr[start]&& arr[mid]==arr[end]) {
				//check if start is pivot
				if(arr[start]>arr[start+1]) {
					return start+1;
				}
				start++;
				if(arr[end]<arr[end-1]) {
					return end-1;
				}
				end--;	
			}
			else if(arr[mid]>arr[start]||(arr[mid]==arr[start]&&arr[mid]>arr[end])) {
				//Pivot is in right side 
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;

	}
}
