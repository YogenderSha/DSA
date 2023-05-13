package com.dsa.arrays;

import java.util.Arrays;

public class Q062_Arrays_sortedSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(arr)));

	}
	
	public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++) {
        	nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
