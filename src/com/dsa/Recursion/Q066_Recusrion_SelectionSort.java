package com.dsa.Recursion;

import java.util.Arrays;

public class Q066_Recusrion_SelectionSort {

	public static void main(String[] args) {
               int[] nums= {223,345,122,100,90};
               SelectionSort(nums, 0, 0, 0);
               System.out.println(Arrays.toString(nums));
	}
	public static void SelectionSort(int[] arr,int index,int maxIndex,int count) {
		if(count==0) {
			return;
		}
		if(index<count) {
			if(arr[index]>arr[maxIndex]) {
				maxIndex=index;
			}
			SelectionSort(arr, index+1, maxIndex, count);

	   }else {
			swap(arr,maxIndex,count);
			SelectionSort(arr, 0, 0, count-1);
		}
	}
	public static void swap(int[] arr, int maxIndex, int ind) {
		int temp=arr[maxIndex];
		arr[maxIndex]=arr[ind-1];
		arr[ind-1]=temp;
		
	}

}
