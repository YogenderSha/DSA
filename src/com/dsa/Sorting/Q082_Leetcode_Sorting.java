package com.dsa.Sorting;

import java.util.Arrays;

public class Q082_Leetcode_Sorting {

	public static void main(String[] args) {
       int[] arr= {3, 4, 4, 1, 2, 0};
       System.out.println(isGood(arr));
	}
	
	 public static boolean isGood(int[] nums) {
		 int i=0;
	        while (i < nums.length) {
				int pos = nums[i]-1;
				if (nums[i]!=0 && nums[i]< nums.length && nums[i] != nums[pos]) {
					swap(nums, i, pos);
				} else {
					i++;
				}
			}
	        
	        for (i = 0; i < nums.length; i++) {
				if (nums[i] != i + 1 && nums[i] !=nums.length-1) {
	                return false;
				}
			}
	        
	        return true;
	        
	    }
	    
	    public static void swap(int[] arr, int start, int end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}

}
