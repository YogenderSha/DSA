package com.dsa.Sorting;

public class Q046_Sorting_RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
       public void rotateArray(int[] nums, int k) {
        int index=0;
        int li=nums.length-1;
        while(index>0) {
        	nums[li]=nums[k-1];
        }
    }

}
