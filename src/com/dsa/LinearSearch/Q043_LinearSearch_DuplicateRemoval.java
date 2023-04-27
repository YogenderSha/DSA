package com.dsa.LinearSearch;

public class Q043_LinearSearch_DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,1,2 };
		System.out.println(numCounter(arr));

	}
	
	
	/* public static int numCounter(int[] nums) {
		int count=0;
		int i=0;
		while(i<nums.length) {
			if(nums[i]==nums[i+1]) {
				i++;
			}
			count++;
		}
		return count ;
	}
	*/
	
	public static int numCounter(int[] nums ) {
		int addIndex=1;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]<nums[i+1]) {
				nums[addIndex]=nums[i+1];
				addIndex++;
				
			}
			
		}
		return addIndex;
	}
	

}
