package com.dsa.Recursion;

import java.util.Arrays;

public class Q065_Recursion_BubbleSort {

	public static void main(String[] args) {
		int[] arr= {};
		BubbleSort(arr, 0, 5);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void BubbleSort(int[] arr,int index,int count) {
		
		if(count==0) {
			return;
		}
		
		if(index<count) {
			if(index<arr.length-1 && arr[index]>arr[index+1]) {
				swap(arr,index,index+1);
				BubbleSort(arr, index+1, count);
			}else {
				BubbleSort(arr, index+1, count);
			}
		}
		else {
			BubbleSort(arr, 0, count-1);
		}
	}

	public static void swap(int[] nums,int x, int y) {
		int temp=nums[x];
		nums[x]=nums[y];
		nums[y]=temp;
		
	}

}
