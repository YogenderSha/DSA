package com.dsa.arrays;

import java.util.Arrays;

public class Q078_Arrays_PermutationArray {

	public static void main(String[] args) {
        int [] arr= {};
        System.out.println(Arrays.toString(buildArray(arr)) );
        int[] nums= {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)) );

        
	}

	public static int[] buildArray(int[] nums) {
		if(nums.length==0) {
			return nums;
		}
		int[] mix=new int[nums.length];
		for (int i=0;i<nums.length;i++) {
			mix[i]=nums[nums[i]];
		}
		return mix;

	}

}
