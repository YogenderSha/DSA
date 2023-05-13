package com.dsa.arrays;

import java.util.Arrays;

public class Q061_Arrays_rotateArrays {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		rotate(arr, 4);
		System.out.println(Arrays.toString(arr));

	}

	public static void rotate(int[] nums, int k) {
		int[] arr=new int[nums.length];
		int i=0;
		while(i<nums.length) {
			int j=(i+k)%nums.length;
			arr[j]=nums[i];
			i++;
			
		} 	
		
		for(int x=0;x<nums.length;x++) {
			nums[x]=arr[x];
		}
	}

}
