package com.dsa.Sorting;import java.util.Arrays;

public class Q022_Sorting_MajorityElem {
	/*
	 * Majority Element
	 * {Leetcode : 169} 
	 *  https://leetcode.com/problems/majority-element/
	 *  Majority Element : The element which appears more than n/2 times in the given array
	 */

	public static void main(String[] args) {
		int[] arr= {2,2,1,1,1,2,2};
		System.out.println(MajorityElem(arr));

	}
	//Moore Voting Algorithm
	public static int MajorityElem(int[] nums) {
		int count=0;
		int elem=0;
		for(int num : nums) {
			if(count==0) elem=num;
			if(elem==num) count+=1;
			else count-=1;
		}
		return elem;
		
	}

}
